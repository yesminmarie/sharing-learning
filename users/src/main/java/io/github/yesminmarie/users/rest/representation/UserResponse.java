package io.github.yesminmarie.users.rest.representation;

import io.github.yesminmarie.users.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String name;
    private String email;

    public static UserResponse fromModel(User user){
        return new UserResponse(user.getName(), user.getEmail());
    }
}
