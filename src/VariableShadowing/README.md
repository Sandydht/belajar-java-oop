# Variable Shadowing
- Variable shadowing adalah kejadian ketika kita membuat nama variable yang sama dengan nama variable di scope di atasnya.
- Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class.
- Saat terjadi variable shadowing, maka secara otomatis variable yang berada di atasnya tidak bisa diakses.
- Kode: Variable Shadowing
```java
class Person {
    String name;
    String address;
    final String country = "Indonesia";
    
    Person(String name, String address) {
        name = name; // field name tidak berubah
        address = address; // field address tidak berubah
    }
    
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + name); // field name tidak bisa diakses.
    }
}
```