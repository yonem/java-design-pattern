package jp.ne.yonem.pattern.Adapter.Sample1;

public class Main {

    public static void main(String[] args) {
        var p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
