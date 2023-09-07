package jp.ne.yonem.pattern.Prototype.Sample.framework;

public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
