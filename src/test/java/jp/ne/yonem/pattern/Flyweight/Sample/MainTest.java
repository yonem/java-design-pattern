package jp.ne.yonem.pattern.Flyweight.Sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Flyweight")
    void test1() {
        var bs = new BigString("95-959-57");  // 共有しない
        bs.print();
        bs = new BigString("959-5-957");      // 共有する
        bs.print();
    }
}