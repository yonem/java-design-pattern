package jp.ne.yonem.pattern.Strategy.Q4;

public class Main {

    public static void main(String[] args) {
        String[] data = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        var sap = new SortAndPrint(data, new SelectionSorter());
        sap.execute();
    }
}
