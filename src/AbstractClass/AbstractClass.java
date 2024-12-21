package AbstractClass;

import AbstractClass.City.City;

public class AbstractClass {
    public static void main(String[] args) {
//        var location = new Location(); // error
        var city = new City();

        System.out.println("City: " + city);
    }
}
