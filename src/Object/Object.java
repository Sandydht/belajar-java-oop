package Object;

class Person {

}

public class Object {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person();

        Person person3;
        person3 = new Person();

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);
    }
}
