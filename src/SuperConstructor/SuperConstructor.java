package SuperConstructor;

class Manager {
    String name;

    Manager(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        var manager = new Manager("Sandy");
        manager.sayHello("Budi");

        var vicePresident = new VicePresident("Handoko");
        vicePresident.sayHello("Dwi");
    }
}
