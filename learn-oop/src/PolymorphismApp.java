public class PolymorphismApp {
    public static void main(String[] args) {

        // meskipun type Employee bisa instance Manager dan VicePresident
        Employee employee = new Employee("Bob");
        // access sayHello own by Employee
        employee.sayHello("John");

        employee = new Manager("Bob");
        // access sayHello own by Manager
        employee.sayHello("John");

        employee = new VicePresident("Bob");
        // access sayHello own by VP
        employee.sayHello("John");

        // Method Polymorphism
        sayHello(new Employee("Bab"));
        sayHello(new Manager("Bip"));
        sayHello(new VicePresident("Bob"));

    }

    // Method Polymorphism
    // cukup bikin satu karena satu type yg sama
    static void sayHello(Employee employee) {
        // Type Check dan Casts
        if(employee instanceof VicePresident) {
            // casts / conversion
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }
        // Diffrent form
        else if (employee instanceof Manager manager) {
            System.out.println("Hello Manager " + manager.name);
        }
        else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
