package jp.ne.yonem.pattern.FactoryMethod.Sample.framework;

public abstract class Factory {

    public final Product create(String owner) {
        var p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
