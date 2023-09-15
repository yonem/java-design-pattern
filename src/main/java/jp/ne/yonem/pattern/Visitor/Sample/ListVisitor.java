package jp.ne.yonem.pattern.Visitor.Sample;

public class ListVisitor extends Visitor {

    private String currentDir = "";                         // 現在注目しているディレクトリ名

    public void visit(File file) {                          // ファイルを訪問したときに呼ばれる
        System.out.println(currentDir + "/" + file);
    }

    public void visit(Directory directory) {                // ディレクトリを訪問したときに呼ばれる
        System.out.println(currentDir + "/" + directory);
        var saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        var it = directory.iterator();

        while (it.hasNext()) {
            var entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
