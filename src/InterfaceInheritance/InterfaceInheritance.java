package InterfaceInheritance;

interface HasBrand {
    String getBrand();
}

interface Car extends HasBrand {
    void drive();
}

interface IsMaintenance {
    boolean isMaintenance();
}

class Avanza implements Car, IsMaintenance {
    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }

    public void drive() {
        System.out.println("Drive Avanza");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Avanza avanza = new Avanza();
        System.out.println(avanza.getBrand());
        System.out.println(avanza.isMaintenance());
        avanza.drive();
    }
}
