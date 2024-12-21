package Polymorphism;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }
}

class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Sandy");
        employee.sayHello(employee);

        employee = new Manager("Handoko");
        employee.sayHello(employee);

        employee = new VicePresident("Trapsilo");
        employee.sayHello(employee);
    }
}
