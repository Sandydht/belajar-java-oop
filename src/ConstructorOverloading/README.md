# Constructor Overloading
- Sama seperti di method, di constructor pun kita bisa melakukan overloading.
- Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda.
- Kode: Constructor Overloading
```java
class Person {
    String name;
    String address;
    final String country = "Indonesia";
    
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }
    
    Person(String paramName) {
        name = paramName;
    }
    
    Person() {
        
    }
}
```
- Kode: Menggunakan Constructor Overloading
```java
var person1 = new Person("Sandy", "Kendal");
var person2 = new Person("Sandy");
var person3 = new Person("");
```

# Memanggil Constructor Lain
- Constructor bisa memanggil constructor lain.
- Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan.
- Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci ``` this ```.
- Kode: Memanggil Constructor Lain
```java
class Person {
    String name;
    String address;
    final String country = "Indonesia";
    
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }
}
```