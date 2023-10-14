package jp.ne.yonem.pattern.AbstractFactory.A2;

import jp.ne.yonem.pattern.AbstractFactory.A2.factory.Factory;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        var factory = Factory.getFactory(args[0]);
        var page = factory.createYahooPage();
        page.output();
    }
}
