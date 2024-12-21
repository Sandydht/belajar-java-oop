# Polymorphism
- Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
- Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.
- Polymorphism erat hubungannya dengan inheritance.
- Kode: Inheritance
```java
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }
}

class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }
}
```
- Kode: Polymorphism
```java
Employee employee = new Employee("Sandy");
employee.sayHello("Dwi");

employee = new Manager("Handoko");
employee.sayHello("Dwi");

employee = new VicePresident("Trapsilo");
employee.sayHello("Dwi");
```
- Kode: Method Polymorphism
```java
static void sayHello(Employee employee) {
    System.out.println("Hello " + employee.name);
}
```