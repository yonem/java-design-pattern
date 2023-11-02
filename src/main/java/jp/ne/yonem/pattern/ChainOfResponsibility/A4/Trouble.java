package jp.ne.yonem.pattern.ChainOfResponsibility.A4;

/**
 * @param number トラブル番号
 */
public record Trouble(int number) {

    public String toString() {      // トラブルの文字列表現
        return "[Trouble " + number + "]";
    }
}
