package programmer.zaman.now.data;

class SocialMedia {
    String name;

    final void login(String username, String password) { }
}

final class Facebook extends SocialMedia {

    // error, method is final
//    void login(String username, String password) {}
}

// Error
//class FakeBook extends Facebook { }
