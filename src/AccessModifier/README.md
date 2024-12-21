# Access Modifier
- Access modifier adalah kemampuan untuk membuat class, field, method dan constructor agar dapat diakses dari mana saja.

## Access Level
| Modifier     | Class | Package | Subclass | World |
|--------------| ----- | ------- | -------- | ----- |
| public       | Y     | Y       | Y        | Y     |
| protected    | Y     | Y       | Y        | N     |
| no modifier  | Y     | Y       | N        | N     |
| private      | Y     | N       | N        | N     |

## Public Class
- Kita hanya bisa membuat 1 public class di 1 file java.
- Selain itu, nama public class harus sama dengan nama file.
- Kode: Access Modifier (1)
```java
import sandy.belajarjava.data;

public class Product {
    protected String name;
    protected int price;
    
    public String getName() {
        return this.name;
    }
    
    public int getPrice() {
        return this.price;
    }
}
```
- Kode: Access Modifier (2)
```java
package sandy.belajarjava.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Indomie"; // bisa diakses karena di package yang sama
        product.price = 2000; // bisa diakses karena di package yang sama

        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
    }
}
```