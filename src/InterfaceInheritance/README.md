# Interface Inheritance
- Sebelumnya kita sudah tahu kalo di Java, child class hanya bisa punya 1 parent class.
- Namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface.
- Bahkan interface pun bisa implement interface lain, bisa lebih dari 1. Namun jika interface ingin mewarisi interface lain, kita menggunakan kata kunci ``` extends ```, bukan ``` implements ```.
- Kode: Interface Inheritance
```java
public interface HasBrand {
    String getBrand();
}

public interface Car extends HasBrand {
    void drive();
}
```
- Kode: Multiple Interface Inheritance
```java
public class Avanza implements Car, IsMaintenance {
    public String getBrand() {
        return "Toyota";
    }
    
    public boolean isMaintenance() {
        return false;
    }
    
    public void drive() {
        System.out.println("Drive Avanza");
    }
}
```