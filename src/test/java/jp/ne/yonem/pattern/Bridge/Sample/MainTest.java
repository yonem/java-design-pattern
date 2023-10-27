package jp.ne.yonem.pattern.Bridge.Sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Output Hello")
    void test1() {
        var d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        var d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        var d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}