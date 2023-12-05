package jp.ne.yonem.pattern.Decorator.A2;

public class Main {

    public static void main(String[] args) {
        var md = new MultiStringDisplay();
        md.add("おはようございます。");
        md.add("こんにちは。");
        md.add("おやすみなさい、また明日。");
        md.show();

        var d1 = new SideBorder(md, '#');
        d1.show();

        var d2 = new FullBorder(md);
        d2.show();
    }
}
