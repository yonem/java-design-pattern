package jp.ne.yonem.pattern.ChainOfResponsibility.Sample;

/**
 * @param number トラブル番号
 */
public record Trouble(int number) {

    // トラブルの生成
    public String toString() {      // トラブルの文字列表現
        return "[Trouble " + number + "]";
    }
}
