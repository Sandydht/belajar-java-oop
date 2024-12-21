package ConstructorOverloading;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName) {
        name = paramName;
    }

    Person() {

    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        var person1 = new Person("Sandy", "Kendal");
        var person2 = new Person("Sandy");
        var person3 = new Person();

        System.out.println("person1 " + person1.name);
        System.out.println("person2 " + person2.name);
        System.out.println("person3 " + person3.name);
    }
}
