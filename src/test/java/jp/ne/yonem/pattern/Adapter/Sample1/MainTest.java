package jp.ne.yonem.pattern.Adapter.Sample1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Output Hello")
    void test1() {
        var p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}