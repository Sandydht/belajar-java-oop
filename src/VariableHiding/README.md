# Variable Hiding
- Variable hiding merupakan masalah yang terjadi ketika kita membuat nama field yang sama di child class dengan di parent class.
- Tidak ada yang namanya field overriding, ketika kita buat ulang nama field di class child, itu berarti variable hiding.
- Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword.
- Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts.
- Saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable yang ada di class-nya.
- Kode: Variable Hiding
```java
class Parent {
    String name;
    
    void doIt() {
        System.out.println("Do it from parent");
    }
}

class Child extends Parent {
    String name;
    
    void doIt() {
        System.out.println("Do it from child");
    }
}
```
- Kode: Variable Hiding vs Method Overriding
```java
Child child = new Child();
child.name = "Sandy";
child.doIt();
System.out.println(child.name);

Parent parent = (Parent) child;
parent.doIt();
System.out.println(parent.name);
```