package jp.ne.yonem.pattern.Builder.A2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

    private String filename;                                    // 作成するファイル名
    private PrintWriter writer;                                 // ファイルに書き込むPrintWriter

    protected void buildTitle(String title) {                       // HTMLファイルでのタイトル
        filename = title + ".html";                                 // タイトルを元にファイル名決定

        try {
            writer = new PrintWriter(new FileWriter(filename));     // PrintWriterを作る
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");    // タイトルを出力
        writer.println("<h1>" + title + "</h1>");
    }

    protected void buildString(String str) {                        // HTMLファイルでの文字列
        writer.println("<p>" + str + "</p>");  // <p>タグで出力
    }

    protected void buildItems(String[] items) {                     // HTMLファイルでの箇条書き
        writer.println("<ul>");                                     // <ul>と<li>で出力
        for (String item : items) writer.println("<li>" + item + "</li>");
        writer.println("</ul>");
    }

    protected void buildDone() {                                    // 文書の完成
        writer.println("</body></html>");                           // タグを閉じる
        writer.close();                                             // ファイルをクローズ
    }

    public String getResult() {
        return filename;                    // ファイル名を返す
    }
}
