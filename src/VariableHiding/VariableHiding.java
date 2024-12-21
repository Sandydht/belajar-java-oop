package VariableHiding;

class Parent {
    String name;

    void doIt() {
        System.out.println("Do it from parent");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("Do it from child");
    }
}

public class VariableHiding {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Sandy";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
