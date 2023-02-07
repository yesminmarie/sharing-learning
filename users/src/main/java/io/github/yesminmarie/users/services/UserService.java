package io.github.yesminmarie.users.services;

import io.github.yesminmarie.users.domain.User;

import java.util.Optional;

public interface UserService {
    User save(User user);
    Optional<User> getUserByEmail(String email);
}
