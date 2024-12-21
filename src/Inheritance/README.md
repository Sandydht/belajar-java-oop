# Inheritance
- Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain.
- Dalam artian, kita bisa membuat class Parent dan class Child.
- Class Child hanya bisa punya satu akses class Parent, namun satu class Parent bisa punya banyak class Child.
- Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan dimiliki class Child.
- Untuk melakukan pewarisan di class Child, kita harus menggunakan kata kunci ``` extends ``` lalu diikuti nama class Parent-nya.
- Kode: Inheritance
```java
class Manager {
    String name;
     
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

class VicePresident extends Manager {
    
}
```
- Kode: Mengakses Method Parent
```java
var manager = new Manager();
manager.name = "Sandy";
manager.sayHello("Budi");

var vicePresident = new VicePresident();
vicePresident.name = "Dwi";
vicePresident.sayHello("Handoko");
```