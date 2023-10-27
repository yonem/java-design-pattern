package jp.ne.yonem.pattern.Bridge.A3;

public class Main {

    public static void main(String[] args) {
        var d1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        var d2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        d1.increaseDisplay(4);
        d2.increaseDisplay(6);
    }
}
