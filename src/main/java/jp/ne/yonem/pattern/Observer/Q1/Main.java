package jp.ne.yonem.pattern.Observer.Q1;

import jp.ne.yonem.pattern.Observer.A1.DigitObserver;
import jp.ne.yonem.pattern.Observer.A1.GraphObserver;
import jp.ne.yonem.pattern.Observer.A1.IncrementalNumberGenerator;

public class Main {

    public static void main(String[] args) {
        var generator = new IncrementalNumberGenerator(10, 50, 5);
        var observer1 = new DigitObserver();
        var observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
