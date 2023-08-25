package jp.ne.yonem.pattern.Adapter.Sample2;

public class Main {
    
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
