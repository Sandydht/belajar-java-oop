# Field
- Fields / Properties / Attributes adalah data yang bisa kita sisipkan di dalam Object.
- Namun sebelum kita memasukkan data di fields, kita harus mendeklarasikan data apa saja yang dimiliki object tersebut di dalam deklarasi class-nya.
- Membuat field sama seperti membuat variable, namun di tempatkan di block class.
- Kode: Field
```java
class Person {
    String name;
    String address;
    final String country = "Indonesia";
}
```

# Manipulasi Field
- Fields yang ada di object, bisa kita manipulasi. Tergantung ``` final ``` atau bukan.
- Jika ``` final ```, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field-nya.
- Untuk memanipulasi data field, caranya seperti pada saat kita memanipulasi data pada variable.
- Untuk mengakses field, kita butuh kata kunci (titik) ``` . ``` setelah nama object dan diikuti nama field-nya.
- Kode: Manipulasi Field
```java
var person = new Person();
person.name = "Sandy Dwi Handoko Trapsilo";
person.address = "Central Java";
// person.country = "Tidak bisa diubah";

System.out.println("name: " + person.name);
System.out.println("address: " + person.address);
```