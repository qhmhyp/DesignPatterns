package FactoryMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class IDCardFactory extends Factory{
    private HashMap database = new HashMap();
    private int serial = 100;

    public HashMap getDatabase() {
        return database;
    }

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDcard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDcard card = (IDcard)product;
        database.put(new Integer(card.getSerial()),card.getOwner());
    }
}
