package Import.Product;

public class Product {
    protected String name;
    protected int price;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String setName(String value) {
        return this.name = value;
    }

    public int setPrice(int value) {
        return this.price = value;
    }
}
