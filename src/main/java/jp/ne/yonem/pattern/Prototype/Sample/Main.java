package jp.ne.yonem.pattern.Prototype.Sample;

import jp.ne.yonem.pattern.Prototype.Sample.framework.Manager;
import jp.ne.yonem.pattern.Prototype.Sample.framework.Product;

public class Main {

    public static void main(String[] args) {

        // 準備
        var manager = new Manager();
        var uLine = new UnderlinePen('~');
        var mBox = new MessageBox('*');
        var sBox = new MessageBox('/');
        manager.register("strong message", uLine);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // 生成
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
