package Class;

public class Person {
    public String name;
    public String address;
    final String country = "Indonesia";

    public Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    public void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
