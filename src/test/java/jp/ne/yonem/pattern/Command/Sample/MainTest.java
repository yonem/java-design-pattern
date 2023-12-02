package jp.ne.yonem.pattern.Command.Sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("フォームの起動")
    void test1() {
        new Main("Command Pattern Sample");
    }
}