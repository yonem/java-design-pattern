package jp.ne.yonem.pattern.Bridge.A1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Output Hello, Japan")
    void test1() {
        var d = new RandomCountDisplay(new StringDisplayImpl("Hello, Japan."));
        d.randomDisplay(10);
    }
}