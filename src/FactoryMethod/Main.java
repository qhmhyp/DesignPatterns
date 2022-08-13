package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product = factory.create("小李");
        Product product1 = factory.create("小w");
        Product product2 = factory.create("小z");
        Product product3 = factory.create("小v");
        product.use();
        product1.use();
        product2.use();
        product3.use();;
    }
}
