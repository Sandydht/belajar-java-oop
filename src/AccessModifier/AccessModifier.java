package AccessModifier;

import AccessModifier.Product.Product;

public class AccessModifier {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Indomie"); // bisa diakses karena di package yang sama
        product.setPrice(2000); // bisa diakses karena di package yang sama

        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
    }
}
