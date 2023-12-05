package jp.ne.yonem.pattern.Decorator.A1;

public class Main {

    public static void main(String[] args) {
        var b1 = new StringDisplay("Hello, world.");
        var b2 = new UpDownBorder(b1, '-');
        var b3 = new SideBorder(b2, '*');
        b1.show();
        b2.show();
        b3.show();
        var b4 =
                new FullBorder(
                        new UpDownBorder(
                                new SideBorder(
                                        new UpDownBorder(
                                                new SideBorder(
                                                        new StringDisplay("こんにちは。"),
                                                        '*'
                                                ),
                                                '='
                                        ),
                                        '|'
                                ),
                                '/'
                        )
                );
        b4.show();
    }
}
