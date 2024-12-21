package Constructor;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        var person = new Person("Sandy Dwi Handoko Trapsilo", "Central Java");
        person.sayHello("Budi");
    }
}
