package io.github.yesminmarie.users.rest.representation;

import io.github.yesminmarie.users.domain.User;
import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private String email;
    private String password;

    public User toModel(){
        return new User(name, email, password);
    }
}
