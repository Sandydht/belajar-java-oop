package Method;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}

public class Method {
    public static void main(String[] args) {
        var person = new Person();
        person.name = "Sandy Dwi Handoko Trapsilo";
        person.address = "Central Java";

        person.sayHello("Budi");
    }
}
