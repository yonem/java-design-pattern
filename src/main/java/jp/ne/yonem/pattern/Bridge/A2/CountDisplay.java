package jp.ne.yonem.pattern.Bridge.A2;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {       // times回繰り返して表示する
        open();
        for (var i = 0; i < times; i++) print();
        close();
    }
}
