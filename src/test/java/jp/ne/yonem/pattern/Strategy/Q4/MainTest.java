package jp.ne.yonem.pattern.Strategy.Q4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Strategy")
    void test1() {
        String[] data = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        var sap = new SortAndPrint(data, new SelectionSorter());
        sap.execute();
    }
}