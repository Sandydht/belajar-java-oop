package AccessModifier.Product;

public class Product {
    protected String name;
    protected int price;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int setPrice(int price) {
        return this.price = price;
    }
}
