package jp.ne.yonem.pattern.FactoryMethod.Sample.idcard;

import jp.ne.yonem.pattern.FactoryMethod.Sample.framework.Factory;
import jp.ne.yonem.pattern.FactoryMethod.Sample.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private final List<String> owners = new ArrayList<>();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
