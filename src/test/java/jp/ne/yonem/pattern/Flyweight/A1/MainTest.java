package jp.ne.yonem.pattern.Flyweight.A1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Flyweight")
    void test1() {
        var bs = new BigString("12-121-23", false); // 共有しない
        bs.print();
        bs = new BigString("121-2-123", true);      // 共有する
        bs.print();
    }
}