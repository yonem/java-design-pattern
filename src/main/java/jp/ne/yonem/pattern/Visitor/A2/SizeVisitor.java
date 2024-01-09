package jp.ne.yonem.pattern.Visitor.A2;

public class SizeVisitor extends Visitor {

    private int size = 0;

    public int getSize() {
        return size;
    }

    public void visit(File file) {
        size += file.getSize();
    }

    public void visit(Directory directory) {
        var it = directory.iterator();

        while (it.hasNext()) {
            var entry = it.next();
            entry.accept(this);
        }
    }
}
