public class PersonApp {
    public static void main(String[] args) {

        // Object
        Person person1 = new Person("Groot", "Wakanda St");

        var person2 = new Person("Watson");

        Person person3;
        person3 = new Person();

        // Update Object
        person3.name = "John";
        person3.address = "New York";
        // person3.country = "x"; // cannot update Cos final.

        // Access Object
        System.out.println(person1); // print memory location
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // person2
        System.out.println(person2.name);

        person2.sayHello("Rocket");

        person3.sayHello("Thor");



    }
}
