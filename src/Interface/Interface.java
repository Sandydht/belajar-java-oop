package Interface;

interface Car {
    void drive();

    int getTire();
}

class Avanza implements Car {
    public void drive() {
        System.out.println("Drive avanza");
    }

    public int getTire() {
        return 4;
    }
}

public class Interface {
    public static void main(String[] args) {
        Avanza avanza = new Avanza();
        avanza.drive();
    }
}
