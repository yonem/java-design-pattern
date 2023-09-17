package jp.ne.yonem.pattern.AbstractFactory.Sample;


import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Factory;

public class Main {
    
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        var factory = Factory.getFactory(args[0]);

        var asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        var yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

        var us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        var jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        var excite = factory.createLink("Excite", "http://www.excite.com/");
        var google = factory.createLink("Google", "http://www.google.com/");

        var traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);

        var trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        var traysearch = factory.createTray("サーチエンジン");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        var page = factory.createPage("LinkPage", "結城 浩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
