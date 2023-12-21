package jp.ne.yonem.pattern.Observer.A1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Observer")
    void test1() {
        var generator = new IncrementalNumberGenerator(10, 50, 5);
        var observer1 = new DigitObserver();
        var observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}