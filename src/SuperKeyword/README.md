# Super Keyword
- Kadang kita ingin mengakses method yang terdapat di class Parent yang sudah terlanjur kita override di class Child.
- Untuk mengakses method miliki class Parent, kita bisa menggunakan kata kunci ``` super ```.
- Sederhananya, super digunakan untuk mengakses class Parent.
- Tidak hanya method, field milik class Parent pun bisa kita akses menggunakan kata kunci ``` super ```.
- Kode: Super Keyword
```java
class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }
    
    int getParentCorner() {
        return super.getCorner();
    }
}
```
- Kode: Mengakses Super Keyword
```java
var rectangle = new Rectangle();
System.out.println(rectangle.getCorner());
System.out.println(rectangle.getParentCorner());
```