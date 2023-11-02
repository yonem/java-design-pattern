package jp.ne.yonem.pattern.ChainOfResponsibility.A4;

public class LimitSupport extends Support {

    private final int limit;                              // この番号未満なら解決できる

    public LimitSupport(String name, int limit) {   // コンストラクタ
        super(name);
        this.limit = limit;
    }

    protected boolean resolve(Trouble trouble) {         // 解決用メソッド
        return trouble.number() < limit;
    }
}
