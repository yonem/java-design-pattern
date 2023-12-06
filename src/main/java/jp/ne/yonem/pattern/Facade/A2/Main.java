package jp.ne.yonem.pattern.Facade.A2;

import jp.ne.yonem.pattern.Facade.A2.pagemaker.PageMaker;

public class Main {

    public static void main(String[] args) {
        PageMaker.makeLinkPage("linkpage.html");
        PageMaker.makeWelcomePage("example@example.com", "welcome.html");
    }
}
