package jp.ne.yonem.pattern.FactoryMethod.A2.idcard;

import jp.ne.yonem.pattern.FactoryMethod.A2.framework.Factory;
import jp.ne.yonem.pattern.FactoryMethod.A2.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {

    private final HashMap<Integer, String> database = new HashMap<>();
    private int serial = 100;

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    protected void registerProduct(Product product) {
        var card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());
    }

    public HashMap<Integer, String> getDatabase() {
        return database;
    }
}
