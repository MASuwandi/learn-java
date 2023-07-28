class Parent {
    // variable hiding
    String name;

    void doIt() {
        System.out.println("Do it from parent");
    }
}

class Child extends Parent {
    String name;

    // overriding doIt in parent
    void doIt() {
        System.out.println("Do it from child");
        // access parent field
        System.out.println("Parent name is " + super.name + " from child");
    }
}
