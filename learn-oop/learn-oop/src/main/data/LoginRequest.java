package main.data;

// Record Class
// class and constructor / main constructor
// param will become field
// param type final by deault
public record LoginRequest(String username, String password) {
    // auto generate constructor base on parameter in class

    // compact constructor
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    // constructor overloading
    public LoginRequest(String username) {
        // calling main constructer above
        this(username, "");
    }

    public LoginRequest() {
        this("username", "");
    }

    public void sayHello() {
        System.out.println("Hello " + this.username);
    }
}
