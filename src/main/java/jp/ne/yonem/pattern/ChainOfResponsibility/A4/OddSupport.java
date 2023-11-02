package jp.ne.yonem.pattern.ChainOfResponsibility.A4;

public class OddSupport extends Support {

    public OddSupport(String name) {                // コンストラクタ
        super(name);
    }

    protected boolean resolve(Trouble trouble) {    // 解決用メソッド
        return trouble.number() % 2 == 1;
    }
}
