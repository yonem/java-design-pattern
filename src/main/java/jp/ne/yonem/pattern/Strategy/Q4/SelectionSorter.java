package jp.ne.yonem.pattern.Strategy.Q4;

public class SelectionSorter implements Sorter {

    public void sort(Comparable[] data) {

        for (var i = 0; i < data.length - 1; i++) {
            var min = i;

            for (var j = i + 1; j < data.length; j++) {
                if (data[min].compareTo(data[j]) > 0) min = j;
            }
            var passingplace = data[min];
            data[min] = data[i];
            data[i] = passingplace;
        }
    }
}
