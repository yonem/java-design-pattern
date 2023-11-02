package jp.ne.yonem.pattern.ChainOfResponsibility.A4;

public class SpecialSupport extends Support {

    private final int number;                           // この番号だけ解決できる

    public SpecialSupport(String name, int number) {    // コンストラクタ
        super(name);
        this.number = number;
    }

    protected boolean resolve(Trouble trouble) {        // 解決用メソッド
        return trouble.number() == number;
    }
}
