package jp.ne.yonem.pattern.Observer.Sample;

public class Main {

    public static void main(String[] args) {
        var generator = new RandomNumberGenerator();
        var observer1 = new DigitObserver();
        var observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
