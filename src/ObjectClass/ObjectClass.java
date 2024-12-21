package ObjectClass;

class Manager {
    String name;

    Manager(String name) {
        this.name = name;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        var manager = new Manager("Sandy");
        System.out.println(manager);
    }
}
