package jp.ne.yonem.pattern.Bridge.A1;

public class Main {

    public static void main(String[] args) {
        var d = new RandomCountDisplay(new StringDisplayImpl("Hello, Japan."));
        d.randomDisplay(10);
    }
}
