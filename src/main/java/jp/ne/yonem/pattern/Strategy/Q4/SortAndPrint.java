package jp.ne.yonem.pattern.Strategy.Q4;

public class SortAndPrint {

    Comparable[] data;
    Sorter sorter;

    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute() {
        print();
        sorter.sort(data);
        print();
    }

    public void print() {
        for (var datum : data) System.out.print(datum + ", ");
        System.out.println();
    }
}
