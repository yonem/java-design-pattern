package jp.ne.yonem.pattern.Facade.Sample;

import jp.ne.yonem.pattern.Facade.Sample.pagemaker.PageMaker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Facade")
    void test1() {
        PageMaker.makeWelcomePage("example@example.com", "welcome.html");
    }
}