package jp.ne.yonem.pattern.Visitor.A2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
    
    private final String name;                    // ディレクトリの名前
    private final List<Entry> dir = new ArrayList<>();      // ディレクトリエントリの集合

    public Directory(String name) {         // コンストラクタ
        this.name = name;
    }

    public String getName() {               // 名前を得る
        return name;
    }

    public int getSize() {                  // サイズを得る
        var v = new SizeVisitor();
        accept(v);
        return v.getSize();
    }

    public Entry add(Entry entry) {         // エントリの追加
        dir.add(entry);
        return this;
    }

    public Iterator<Entry> iterator() {
        return dir.iterator();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
