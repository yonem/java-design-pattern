package jp.ne.yonem.pattern.Builder.A3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("frame")
    void test1() {
        var framebuilder = new FrameBuilder();
        var director = new Director(framebuilder);
        director.construct();
        var frame = framebuilder.getResult();
        frame.setVisible(true);
    }
}