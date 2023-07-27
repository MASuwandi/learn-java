package main.data;

class SocialMedia {
    String name;

    // Final Method
    final void login(String username, String password) { }
}

// Final Class
final class Facebook extends SocialMedia {

    // error, method is final
//    void login(String username, String password) {}
}

// Error
//class FakeBook extends Facebook { }
