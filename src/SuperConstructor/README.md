# Super Constructor
- Tidak hanya untuk mengakses method atau field yang ada di class parent, kata kunci ``` super ``` juga bisa digunakan untuk mengakses constructor.
- Namun syaratnya untuk mengakses parent class constructor, kita harus mengakses nya melalui class child constructor.
- Jika sebuah class parent tidak memiliki constructor yang tidak ada parameter-nya (tidak memiliki default constructor), maka class child wajib mengakses constructor class parent tersebut.
- Kode: Super Constructor
```java
class Manager {
    String name;
    
    Manager(String name) {
        this.name = name;
    }
    
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }
}
```
- Kode: Menggunakan Super Constructor
```java
var manager = new Manager("Sandy");
manager.sayHello("Budi");

var vicePresident = new VicePresident("Handoko");
vicePresident.sayHello("Dwi");
```