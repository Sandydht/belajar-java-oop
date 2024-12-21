package TypeCheckAndCasts;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
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

public class TypeCheckAndCasts {
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }

    public static void main(String[] args) {
        var employee = new Employee("Sandy");
//        employee = new Manager("Handoko");
//        employee = new VicePresident("Trapsilo");

        sayHello(employee);
    }
}
