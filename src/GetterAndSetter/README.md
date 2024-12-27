# Getter dan Setter

## Encapsulation
- Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar.
- Hal ini bertujuan agar kita bisa menjaga data sebuah object tetap baik dan valid.
- Untuk mencapai hal ini, biasanya kita membuat semua field menggunakan access modifier private, sehingga tidak bisa diakses atau diubah dari luar.
- Agar bisa diubah, kita perlu menyediakan method untuk mengubah dan mendapatkan field tersebut.

## Getter dan Setter
- Di Java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan getter dan setter method.
- Getter adalah function yang dibuat untuk mengambil data field.
- Setter adalah function yang dibuat untuk mengubah data field.

### Getter dan Setter Method
| Tipe Data | Getter Method | Setter Method          |
| --------- | ------------- |------------------------|
| boolean   | isXxx()       | setXxxx(boolean value) | 
| primitif  | getXxx()      | setXxx(primitif value) |
| Object    | getXxx()      | setXxx(Object value)   |

- Kode: Getter dan Setter
```java
public class Category {
    private String id;
    private boolean expensive;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
}
```
- Kode: Validation Setter
```java
public String getId() {
    return id;
}

public void setId(String id) {
    if (id != null) {
        this.id = id;
    }
}
```