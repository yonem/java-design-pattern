package jp.ne.yonem.pattern.FactoryMethod.Sample;

import jp.ne.yonem.pattern.FactoryMethod.Sample.idcard.IDCardFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("FactoryMethod")
    void test1() {
        var factory = new IDCardFactory();
        var card1 = factory.create("蛇場太郎");
        var card2 = factory.create("とむら");
        var card3 = factory.create("佐藤花子");
        card1.use();
        card2.use();
        card3.use();
    }
}