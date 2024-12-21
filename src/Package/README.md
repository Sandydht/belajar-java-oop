# Package
- Saat kita membuat aplikasi, bisa dipastikan kita akan banyak sekali membuat class.
- Jika class terlalu banyak, kadang akan menyulitkan kita untuk mencari atau mengklarifikasikan jenis - jenis class.
- Java memiliki fitur package, yaitu mirip seperti folder / direktori, dimana kita bisa menyimpan class - class kita di dalam package.
- Sama seperti folder / direktori, package juga bisa nested, kita bisa menggunakan tanda ``` . ``` (titik) untuk membuat nested package.
- Ketika kita menyimpan class di dalam package, maka di atas file Java nya kita wajib menyebutkan nama package-nya.
- Kode: Package
```java
package sandy.belajarjava.data;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
```