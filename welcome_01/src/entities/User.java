package entities;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "Username='" + username + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }

}
