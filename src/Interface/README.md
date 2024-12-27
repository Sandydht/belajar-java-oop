# Interface
- Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class childnya.
- Namun sebenarnya yang lebih tepat untuk kontrak adalah interface.
- Jangan salah sangka bahwa interface disini bukanlah user interface.
- Interface mirip seperti abstract class, yang membedakan adalah di interface semua method otomatis abstract (tidak memiliki block).
- Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah).
- Untuk mewariskan interface kita tidak menggunakan kata kunci extends, melainkan implements.
- Kode: Membuat interface
```java
public interface Car {
    void drive();
    
    int getTire();
}
```
- Kode: Implement interface
```java
public class Avanza implements Car {
    public void drive() {
        System.out.println("Drive avanza");
    }
    
    public int getTire() {
        return 4;
    }
}
```