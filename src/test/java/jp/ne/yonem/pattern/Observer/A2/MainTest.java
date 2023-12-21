package jp.ne.yonem.pattern.Observer.A2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Observer")
    void test1() {
        var generator = new RandomNumberGenerator();
        var observer1 = new DigitObserver();
        var observer2 = new GraphObserver();
        var observer3 = new FrameObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();
    }
}