package io.github.yesminmarie.users.services.impl;

import io.github.yesminmarie.users.domain.User;
import io.github.yesminmarie.users.infra.repository.UsersRepository;
import io.github.yesminmarie.users.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UsersRepository repository;

    @Override
    @Transactional
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return repository.findByEmail(email);
    }
}
