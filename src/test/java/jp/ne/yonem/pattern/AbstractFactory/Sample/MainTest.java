package jp.ne.yonem.pattern.AbstractFactory.Sample;

import jp.ne.yonem.pattern.AbstractFactory.Sample.factory.Factory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

    @Test
    @DisplayName("ListFactory")
    void test1() {
        var factory = Factory.getFactory("jp.ne.yonem.pattern.AbstractFactory.Sample.listfactory.ListFactory");
        output(factory, "ListFactory");
    }

    @Test
    @DisplayName("TableFactory")
    void test2() {
        var factory = Factory.getFactory("jp.ne.yonem.pattern.AbstractFactory.Sample.tablefactory.TableFactory");
        output(factory, "TableFactory");
    }

    private void output(Factory factory, String fileName) {
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

        var page = factory.createPage(fileName, "蛇場　太郎");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}