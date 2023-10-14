package jp.ne.yonem.pattern.AbstractFactory.A2;

import jp.ne.yonem.pattern.AbstractFactory.A2.factory.Factory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractFactoryA2Test {

    @Test
    @DisplayName("ListFactory")
    void test1() {
        var factory = Factory.getFactory("jp.ne.yonem.pattern.AbstractFactory.A2.listfactory.ListFactory");
        var page = factory.createYahooPage("ListFactory");
        page.output();
    }

    @Test
    @DisplayName("TableFactory")
    void test2() {
        var factory = Factory.getFactory("jp.ne.yonem.pattern.AbstractFactory.A2.tablefactory.TableFactory");
        var page = factory.createYahooPage("TableFactory");
        page.output();
    }
}