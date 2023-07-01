public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        /*
        * Kode: Manipulasi Field
        */
        person1.name = "Sandy Dwi Handoko Trapsilo";
        person1.address = "Kendal, Central Java";

        person2.name = "Joko Nugroho";
        person2.address = "Subang";

        person3.name = "Budi Nugraha";
        person3.address = "Bandung";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        System.out.println(person2.name);
        System.out.println(person2.address);

        System.out.println(person3.name);
        System.out.println(person3.address);

        /*
        * Kode: Method (1)
        */
        person1.sayHello("Joko");
        person2.sayHello("Budi");
        person3.sayHello("Sandy");
    }
}
