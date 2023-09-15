package jp.ne.yonem.pattern.Strategy.Sample;

public class Hand {

    public static final int HAND_VALUE_GUU = 0;  // グーを表す値
    public static final int HAND_VALUE_CHO = 1;  // チョキを表す値
    public static final int HAND_VALUE_PAA = 2;  // パーを表す値

    public static final Hand[] hand = {         // じゃんけんの手を表す3つのインスタンス
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA),
    };

    private static final String[] name = {      // じゃんけんの手の文字列表現
            "グー", "チョキ", "パー",
    };

    private final int handValue;                      // じゃんけんの手の値

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) { // 値からインスタンスを得る
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {     // thisがhより強いときtrue
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {       // thisがhより弱いときtrue
        return fight(h) == -1;
    }

    private int fight(Hand h) {                 // 引き分けは0, thisの勝ちなら1, hの勝ちなら-1

        if (this == h) {
            return 0;

        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;

        } else {
            return -1;
        }
    }

    public String toString() {                  // 文字列表現へ変換
        return name[handValue];
    }
}
