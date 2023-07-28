public class Computer {
    String name;
    String brand;
    String CPU;
    String memory;
    String storage;
    String GPU;

    // This
    Computer(String name, String brand, String CPU, String memory, String storage, String GPU) {
        this.name = name;
        this.brand = brand;
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
        this.GPU = GPU;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Computer is " + this.name);
    }

}
