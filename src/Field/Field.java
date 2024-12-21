package Field;

class Person {
    String name;
    String address;
    final String country = "Indonesia";
}

public class Field {
    public static void main(String[] args) {
        var person = new Person();

        System.out.println("name: " + person.name);
        System.out.println("address: " + person.address);
        System.out.println("country: " + person.country);
    }
}
