# Method Overriding
- Method overriding adalah kemampuan mendeklarasikan ulang method di class Child-nya, yang sudah ada di class Parent.
- Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class Child, method yang di class Parent tidak bisa diakses lagi.
- Kode: Method Overriding
```java
class Manager {
    String name;
    
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

class VicePresident extends Manager {
    void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
```
- Kode: Mengakses Method Overriding
```java
var manager = new Manager();
manager.name = "Sandy";
manager.sayHello("Budi");

var vicePresident = new VicePresident();
vicePresident.name = "Dwi";
vicePresident.sayHello("Handoko");
```