package jp.ne.yonem.pattern.Flyweight.Sample;

public class BigString {

    // 「大きな文字」の配列
    private final BigChar[] bigChars;

    // コンストラクタ
    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        var factory = BigCharFactory.getInstance();

        for (var i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 表示
    public void print() {

        for (var bigchar : bigChars) {
            bigchar.print();
        }
    }
}
