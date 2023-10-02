package jp.ne.yonem.pattern.Flyweight.Sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class BigChar {

    // 大きな文字を表現する文字列('#' '.' '\n'の列)
    private String fontData;

    // コンストラクタ
    public BigChar(char charName) {

        // 文字の名前
        try (var reader = new BufferedReader(new FileReader(Objects.requireNonNull(BigChar.class.getResource("big" + charName + ".txt")).getPath()))) {
            String line;
            var buf = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            this.fontData = buf.toString();

        } catch (IOException e) {
            this.fontData = charName + "?\n";
        }
    }

    // 大きな文字を表示する
    public void print() {
        System.out.print(fontData);
    }
}
