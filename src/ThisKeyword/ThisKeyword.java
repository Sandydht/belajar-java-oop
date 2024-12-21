package ThisKeyword;

class Person {
    String name;
    String address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello() {
        this.sayHello("Bos");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        var person = new Person("Sandy Dwi Handoko Trapsilo", "Central Java");
        person.sayHello("Budi");
    }
}
