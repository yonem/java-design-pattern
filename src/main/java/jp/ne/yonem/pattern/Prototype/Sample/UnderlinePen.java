package jp.ne.yonem.pattern.Prototype.Sample;


import jp.ne.yonem.pattern.Prototype.Sample.framework.Product;

public class UnderlinePen implements Product {

    private final char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    public void use(String s) {
        var length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (var i = 0; i < length; i++) System.out.print(ulchar);
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
