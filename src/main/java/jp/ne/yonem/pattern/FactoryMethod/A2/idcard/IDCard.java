package jp.ne.yonem.pattern.FactoryMethod.A2.idcard;

import jp.ne.yonem.pattern.FactoryMethod.A2.framework.Product;

public class IDCard extends Product {

    private final String owner;
    private final int serial;

    IDCard(String owner, int serial) {
        System.out.println(owner + "(" + serial + ")" + "のカードを作ります。");
        this.owner = owner;
        this.serial = serial;
    }

    public void use() {
        System.out.println(owner + "(" + serial + ")" + "のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
