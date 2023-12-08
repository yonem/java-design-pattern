package jp.ne.yonem.pattern.Flyweight.A1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class BigChar {

    // 文字の名前
    private final char charname;

    // 大きな文字を表現する文字列('#' '.' '\n'の列)
    private String fontdata;

    // コンストラクタ
    public BigChar(char charname) {
        this.charname = charname;

        try (var reader = new BufferedReader(new FileReader(Objects.requireNonNull(BigChar.class.getResource("big" + charname + ".txt")).getPath()))) {
            String line;
            var buf = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            this.fontdata = buf.toString();

        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 大きな文字を表示する
    public void print() {
        System.out.print(fontdata);
    }
}
