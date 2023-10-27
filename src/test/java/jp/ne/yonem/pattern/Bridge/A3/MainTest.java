package jp.ne.yonem.pattern.Bridge.A3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Output enclosed text")
    void test1() {
        var d1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        var d2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        d1.increaseDisplay(4);
        d2.increaseDisplay(6);
    }
}