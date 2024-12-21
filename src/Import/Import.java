package Import;

import Import.Product.Product;

public class Import {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Indomie");
        product.setPrice(2000);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
