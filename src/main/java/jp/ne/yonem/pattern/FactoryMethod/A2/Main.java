package jp.ne.yonem.pattern.FactoryMethod.A2;

import jp.ne.yonem.pattern.FactoryMethod.A2.framework.Factory;
import jp.ne.yonem.pattern.FactoryMethod.A2.framework.Product;
import jp.ne.yonem.pattern.FactoryMethod.A2.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("蛇場太郎");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("佐藤花子");
        card1.use();
        card2.use();
        card3.use();
    }
}
