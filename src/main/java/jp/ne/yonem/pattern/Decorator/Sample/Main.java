package jp.ne.yonem.pattern.Decorator.Sample;

public class Main {

    public static void main(String[] args) {
        var b1 = new StringDisplay("Hello, world.");
        var b2 = new SideBorder(b1, '#');
        var b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        var b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("こんにちは。")),
                                        '*'))),
                '/');
        b4.show();
    }
}
