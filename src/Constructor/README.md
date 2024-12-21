# Constructor
- Saat kita membuat object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ``` () ```.
- Di dalam class Java, kita bisa membuat constructor, constructor adalah method yang akan dipanggil saat pertama kali object dibuat.
- Mirip seperti di method, kita bisa memberi parameter di constructor.
- Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci ``` void ``` atau return value.
- Kode: Membuat Constructor
```java
class Person {
    String name;
    String address;
    final String country = "Indonesia";
    
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
```
- Kode: Menggunakan Constructor
```java
var person = new Person("Sandy Dwi Handoko Trapsilo", "Central Java");
person.name = "Sandy";

person.sayHello("Budi");
```