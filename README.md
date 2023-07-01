# Java Object Oriented Programming

## Catatan
- Harus mengerti dasar Java

## Daftar Isi
- Pengenalan OOP
- Object
- Class
- Method
- Pewarisan
- Interface
- Enum
- Exception
- Dan lain - lain

## Pengenalan Object Oriented Programming

### Apa itu Object Oriented Programming ?
- Object Oriented Programming adalah sudut pandang bahasa pemrograman yang berkonsep "object"
- Ada banyak sudut pandang bahasa pemrograman, namun OOP adalah yang sangat populer saat ini
- Ada beberapa istilah yang perlu dimengerti dalam OOP, yaitu: Object dan Class

#### Apa itu Object ?
- Object adalah data yang berisi field / property / attributes dan method / function / behavior
- Semua data bukan primitif di Java adalah object, dari mulai Integer, Boolean, Character, String, dan yang lainnya

#### Apa itu Class ?
- Class adalah blueprint, prototype atau cetakan untuk membuat Object
- Class berisikan informasi semua properties dan functions yang dimiliki oleh Object
- Setiap Object selalu dibuat dari Class
- Dan dari sebuah Class bisa membuat tanpa batas

```mermaid
---
title: "Class dan Object: Person"
---
classDiagram
    class Person {
        String firstName
        String lastName
        String sayHello(String name)
        String sayGoodBye(String name)
    }
    
    Person --|> eko : Create
    Person --|> joko : Create
    Person --|> budi : Create
    
    eko: firstName = "Eko"
    eko: lastName = "Eko"
    
    joko: firstName = "Joko"
    joko: lastName = "Nugroho"
    
    budi: firstname = "Budi"
    budi: lastName = "Nugraha"
```

```mermaid
---
title: "Class dan Object: Car"
---
classDiagram
    class Car {
        String name
        String brand
        startEngine()
        stopEngine()
    }
    
    Car --|> avanza : Create
    Car --|> almaz : Create
    Car --|> mobilio : Create
    
    avanza: name = "Avanza"
    avanza: brand = "Toyota"
    
    almaz: name = "Almaz"
    almaz: brand = "Wuling"
    
    mobilio: name = "Mobilio"
    mobilio: brand = "Honda"
```

## Class

### Membuat Class
- Untuk membuat class, kita menggunakan kata kunci class
- Penamaan class biasa menggunakan format CamelCase

## Object

### Membuat Object
- Object adalah hasil instansiasi dari sebuah class
- Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung()

## Field
- Fields / Properties / Attributes adalah data yang bisa kita sisipkan di dalam object
- Namun sebelum kita bisa memasukan data di fields, kita harus mendeklarasikan data apa aja yang dimiliki object tersebut di dalam deklarasi class-nya
- Membuat field sama seperti membuat variable, namun ditempatkan di block class

### Manipulasi Field
- Fields yang ada di object, bisa kita manipulasi. Tergantung final atau bukan.
- Jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field nya
- Untuk memanipulasi data field, sama seperti cara pada variable
- Untuk mengakses field, kita butuh kata kunci (.) setelah nama object dan diikuti nama fields nya

## Method
- Selain menambahkan field, kita juga bisa menambahkan method ke object
- Caranya dengan mendeklarasikan method tersebut di dalam block class
- Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang ada di dalam block class
- Untuk mengakses method tesebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method nya. Sama seperti mengakses field

### Constructor
- Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung()
- Di dalam class java, kita bisa membuat constructor, constructor adalah method yang akan dipanggil saat pertama kali object dibuat
- Mirip seperti di method, kita bisa memberi parameter pada constructor
- Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value

### Constructor Overloading
- Sama seperti di method, di constructor pun kita bisa melakukan overloading
- Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda

### Memanggil Constructor Lain
- Constructor bisa memanggil constructor lain
- Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
- Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci this

### Variable Shadowing
- Variable shadowing adalah kejadian ketika kita membuat nama variabel dengan nama yang sama di scope yang menutupi variable dengan nama yang sama di scope diatasnya
- Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class
- Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses

