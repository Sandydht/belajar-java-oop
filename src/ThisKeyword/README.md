# This Keyword
- Saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kata kunci ``` this ``` untuk mengakses object saat ini.
- Misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method, hal ini tidak bisa dilakukan jika langsung menyebut nama field, kita bisa mengakses nama field tersebut dengan kata kunci ``` this ```.
- This juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses method.
- This bisa digunakan untuk mengatasi masalah variable shadowing.
- Kode: This Keyword
```java
class Person {
    String name;
    String address;
    
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    void sayHello() {
        this.sayHello("Bos");
    }
    
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
```