public class VicePresident extends Manager {

    VicePresident(String name) {
        // required calling one of parent constructor
        super(name);
    }

    // Method Overriding
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is VP " + this.name);
    }
}
