package jp.ne.yonem.pattern.Visitor.A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {

    private final String filetype;
    private final List<File> found = new ArrayList<>();

    public FileFindVisitor(String filetype) {           // ".txt"のように拡張子を.付きで指定
        this.filetype = filetype;
    }

    public Iterator<File> getFoundFiles() {                   // 見つかったファイルを得る
        return found.iterator();
    }

    public void visit(File file) {                  // ファイルを訪問したときに呼ばれる
        if (file.getName().endsWith(filetype)) found.add(file);
    }

    public void visit(Directory directory) {   // ディレクトリを訪問したときに呼ばれる
        var it = directory.iterator();

        while (it.hasNext()) {
            var entry = it.next();
            entry.accept(this);
        }
    }
}
