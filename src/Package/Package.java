package Package;

import Package.Product.Product;

public class Package {
    public static void main(String[] args) {
        var product = new Product("Car", 200000000);
        System.out.println("name: " + product.name);
        System.out.println("price: " + product.price);
    }
}
