package jp.ne.yonem.pattern.Prototype.Sample;

import jp.ne.yonem.pattern.Prototype.Sample.framework.Product;

public class MessageBox implements Product {

    private final char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    public void use(String s) {
        var length = s.getBytes().length;
        for (var i = 0; i < length + 4; i++) System.out.print(decoChar);
        System.out.println();
        System.out.println(decoChar + " " + s + " " + decoChar);
        for (var i = 0; i < length + 4; i++) System.out.print(decoChar);
        System.out.println();
    }

    public Product createClone() {

        try {
            return (Product) clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
