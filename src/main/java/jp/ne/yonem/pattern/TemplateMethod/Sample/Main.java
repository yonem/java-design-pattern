package jp.ne.yonem.pattern.TemplateMethod.Sample;

public class Main {

    public static void main(String[] args) {
        var d1 = new CharDisplay('H');                  // 'H'を持ったCharDisplayのインスタンスを1個作る。
        var d2 = new StringDisplay("Hello, world.");    // "Hello, world."を持ったStringDisplayのインスタンスを1個作る。
        var d3 = new StringDisplay("こんにちは。");       // "こんにちは。"を持ったStringDisplayのインスタンスを1個作る。
        d1.display();                                               // d1,d2,d3とも、すべて同じAbstractDisplayのサブクラスのインスタンスだから、
        d2.display();                                               // 継承したdisplayメソッドを呼び出すことができる。
        d3.display();                                               // 実際の動作は個々のクラスCharDisplayやStringDisplayで定まる。
    }
}
