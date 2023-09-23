package jp.ne.yonem.pattern.Facade.Sample;


import jp.ne.yonem.pattern.Facade.Sample.pagemaker.PageMaker;

public class Main {

    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
