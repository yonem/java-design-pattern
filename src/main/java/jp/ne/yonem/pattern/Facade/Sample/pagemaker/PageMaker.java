package jp.ne.yonem.pattern.Facade.Sample.pagemaker;

import java.io.FileWriter;
import java.io.IOException;

public class PageMaker {

    private PageMaker() { // インスタンスは作らないのでprivate宣言する
    }

    public static void makeWelcomePage(String mailAddress, String filename) {

        try {
            var mailProp = Database.getProperties("mailData");
            var username = mailProp.getProperty(mailAddress);
            var writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "のページへようこそ。");
            writer.paragraph("メールまっていますね。");
            writer.mailto(mailAddress, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddress + " (" + username + ")");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
