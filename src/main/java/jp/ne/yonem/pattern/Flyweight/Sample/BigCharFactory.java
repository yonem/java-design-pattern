package jp.ne.yonem.pattern.Flyweight.Sample;

import java.util.HashMap;

public class BigCharFactory {

    // すでに作ったBigCharのインスタンスを管理
    private final HashMap<String, BigChar> pool = new HashMap<>();

    // Singletonパターン
    private static final BigCharFactory singleton = new BigCharFactory();

    // コンストラクタ
    private BigCharFactory() {
    }

    // 唯一のインスタンスを得る
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // BigCharのインスタンス生成(共有)
    public synchronized BigChar getBigChar(char charName) {
        var bc = pool.get("" + charName);

        if (bc == null) {
            bc = new BigChar(charName); // ここでBigCharのインスタンスを生成
            pool.put("" + charName, bc);
        }
        return bc;
    }
}
