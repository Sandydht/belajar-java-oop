# Import
- Import adalah kemampuan untuk menggunakan class yang berada di package yang berbeda.
- Syarat class yang bisa digunakan jika package nya berbeda adalah class yang harus public.
- Kode: Import 
```java
package sandy.belajarjava.data;

import sandy.belajarjava.data.Product;

public class ProductWeb {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Indomie"; // Dapat diakses karena 1 file
        product.price = 2000; // Dapat diakses karena 1 file

        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
```

# Import Semua Package
- Jika kita ingin mengimport semua class di dalam sebuah package, kita bisa menggunakan tanda ``` * ``.
- ``` import sandy.belajar.oop.data; ```

# Default Import
- Secara default, semua class yang ada di package java.lang sudah auto import, jadi kita tidak perlu melakukan import secara manual.
- Contoh class String, Integer, Long, Boolean, dan lain - lain terdapat di package java.lang. Oleh karena itu, kita tidak perlu meng-import nya secara manual.
