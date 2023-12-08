package jp.ne.yonem.pattern.Facade.Q2;

import jp.ne.yonem.pattern.Facade.A2.pagemaker.PageMaker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Facade")
    void test1() {
        PageMaker.makeLinkPage("linkpage.html");
    }
}