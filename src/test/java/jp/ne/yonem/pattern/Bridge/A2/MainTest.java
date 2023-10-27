package jp.ne.yonem.pattern.Bridge.A2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class MainTest {

    @Test
    @DisplayName("Output star.txt")
    void test1() {
        var d = new CountDisplay(new FileDisplayImpl(Objects.requireNonNull(
                Main.class.getResource("star.txt")).getPath()));
        d.multiDisplay(3);
    }
}