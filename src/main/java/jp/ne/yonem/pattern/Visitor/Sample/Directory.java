package jp.ne.yonem.pattern.Visitor.Sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

    private final String name;                     // ディレクトリの名前
    private final List<Entry> dir = new ArrayList<>(); // ディレクトリエントリの集合

    public Directory(String name) {          // コンストラクタ
        this.name = name;
    }

    public String getName() {                // 名前を得る
        return name;
    }

    public int getSize() {                   // サイズを得る
        int size = 0;
        for (Entry entry : dir) size += entry.getSize();
        return size;
    }

    public Entry add(Entry entry) {          // エントリの追加
        dir.add(entry);
        return this;
    }

    public Iterator<Entry> iterator() {      // Iteratorの生成
        return dir.iterator();
    }

    public void accept(Visitor v) {         // 訪問者の受け入れ
        v.visit(this);
    }
}
