
// Class
class Person {
    // Field
    // has null value, default value of Object (non-primitive type)
    String name;
    String address;
    final String country = "Wakanda"; // unchangeable field / property / attribute

    // Constructor
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    // Constructor Overloading
    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    /*
     # Variable Shadowing

        Person(String name, String address) {
            // assign name on param with name on param
            // did not update outside constructor
            name = name;
            address = address;
        }

        void sayHello(String name) {
            System.out.println("Hello " + name + ", My Name is " + name);
        }

        # This can resolve shadowing
        Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        void sayHello(String name) {
            System.out.println("Hello " + name + ", My Name is " + this.name);
        }
    */

    // Method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
