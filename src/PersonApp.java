public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person("Budi");
        Person person3;
        person3 = new Person("Sandy Dwi Handoko Trapsilo", "Kendal, Jawa Tengah");

        /*
        * Kode: Manipulasi Field
        */
        System.out.println("Person 1");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        System.out.println("\n");
        System.out.println("Person 2");
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);

        System.out.println("\n");
        System.out.println("Person 3");
        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);

        /*
        * Kode: Method (1)
        */
        System.out.println("\n");
        person1.sayHello("Joko");
        person2.sayHello("Budi");
        person3.sayHello("Sandy");
    }
}
