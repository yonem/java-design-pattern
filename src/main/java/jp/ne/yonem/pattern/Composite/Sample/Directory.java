package jp.ne.yonem.pattern.Composite.Sample;

import java.util.ArrayList;

public class Directory extends Entry {
    private final String name; // ディレクトリの名前
    private final ArrayList<Entry> directory = new ArrayList<>(); // ディレクトリエントリの集合

    public Directory(String name) { // コンストラクタ
        this.name = name;
    }

    public String getName() { // 名前を得る
        return name;
    }

    public int getSize() { // サイズを得る
        int size = 0;

        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) { // エントリの追加
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix) { // エントリの一覧
        System.out.println(prefix + "/" + this);

        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }
}
