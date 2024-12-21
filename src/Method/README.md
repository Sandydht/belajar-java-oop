# Method 
- Selain menambahkan field, kita juga bisa menambahkan method ke object.
- Caranya dengan mendeklarasikan method tersebut di dalam class.
- Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang ada di dalam class.
- Untuk mengakses method tersebut, kita bisa menggunakan tanda titik ``` . ``` dan diikuti dengan nama method-nya. Sama seperti mengakses field.
- Kode: Method(1)
```java
class Person {
    String name;
    String address;
    final String country = "Indonesia";
    
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
```
- Kode: Method(2)
```java
var person = new Person();
person.name = "Sandy Dwi Handoko Trapsilo";

person.sayHello("Sandy");
```