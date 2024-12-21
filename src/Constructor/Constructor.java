package Constructor;

import Class.Person;

public class Constructor {
    public static void main(String[] args) {
        var person = new Person("Sandy Dwi Handoko Trapsilo", "Central Java");
        person.name = "Sandy";

        person.sayHello("Budi");
    }
}
