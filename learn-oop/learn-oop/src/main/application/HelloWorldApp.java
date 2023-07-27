package main.application;

import main.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        // butuh class konkrit
        // HelloWorld helloWorld = new SampleHelloWorld();

        // Anonymous Class
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello ");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello("Bob");
    }
}
