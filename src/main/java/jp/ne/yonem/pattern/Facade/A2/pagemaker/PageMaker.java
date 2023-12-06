package jp.ne.yonem.pattern.Facade.A2.pagemaker;

import java.io.FileWriter;
import java.io.IOException;

public class PageMaker {

    private PageMaker() {   // インスタンスは作らないのでprivate宣言する
    }

    public static void makeWelcomePage(String mailaddr, String filename) {

        try {
            var mailprop = Database.getProperties("maildata");
            var username = mailprop.getProperty(mailaddr);
            var writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "のページへようこそ。");
            writer.paragraph("メールまっていますね。");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {

        try {
            var writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            var mailprop = Database.getProperties("maildata");
            var en = mailprop.propertyNames();

            while (en.hasMoreElements()) {
                var mailaddr = (String) en.nextElement();
                var username = mailprop.getProperty(mailaddr, "(unknown)");
                writer.mailto(mailaddr, username);
            }
            writer.close();
            System.out.println(filename + " is created.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
