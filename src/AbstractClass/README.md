# Abstract Class
- Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class.
- Abstract class artinya class tersebut tidak bisa dibuat sebagai object secara langsung, hanya bisa diturunkan.
- Untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci ``` abstract ``` sebelum kata kunci ``` class ```.
- Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child.
- Kode: Abstract Class
```java
package sandy.belajarjava.data;

public abstract class Location {
    String name;
}

public class City extends Location {
    
}
```
- Kode: Membuat Abstract Class
```java
public class AbstractClassApp {
    public static void main(String[] args) {
        var location = new Location(); // error
        var city = new City();
    }
}
```