# Object Class
- Di Java, setiap class yang kita buat secara otomatis adalah turunan dari class object.
- Walaupun secara tidak langsung kita eksplisit menyebutkan extends object, tapi secara otomatis Java akan membuat class kita extends object.
- Bisa dikatakan class object adalah superclass untuk semua class yang ada di Java.
- Kode: Menggunakan Class Object
```java
var manager = new Manager("Sandy");
System.out.println(manager); // otomatis memanggil method toString()
System.out.println(manager.toString());
```