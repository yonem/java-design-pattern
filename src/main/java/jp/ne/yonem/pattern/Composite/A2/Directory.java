package jp.ne.yonem.pattern.Composite.A2;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private final String name;
    private final List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;

        for (Entry o : directory) {
            size += o.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);

        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }
}
