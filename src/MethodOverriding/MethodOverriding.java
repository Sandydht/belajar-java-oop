package MethodOverriding;

class Manager {
    String name;

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

class VicePresident extends Manager {
    void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Sandy";
        manager.sayHello("Budi");

        var vicePresident = new VicePresident();
        vicePresident.name = "Dwi";
        vicePresident.sayHello("Handoko");
    }
}
