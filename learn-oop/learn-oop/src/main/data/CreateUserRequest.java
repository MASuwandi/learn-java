package main.data;

import main.annotation.NotBlank;

public class CreateUserRequest {

    // set not allow to blank and null
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
