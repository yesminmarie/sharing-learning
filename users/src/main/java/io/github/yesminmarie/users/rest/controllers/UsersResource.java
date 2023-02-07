package io.github.yesminmarie.users.rest.controllers;

import io.github.yesminmarie.users.rest.representation.UserResponse;
import io.github.yesminmarie.users.rest.representation.UserRequest;
import io.github.yesminmarie.users.domain.User;
import io.github.yesminmarie.users.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@Slf4j
public class UsersResource {

    private final UserService service;

    @GetMapping
    public String status(){
        log.info("User Microservice status");
        return "ok";
    }

    @PostMapping
    public ResponseEntity save(@RequestBody UserRequest request){
        User user = request.toModel();
        service.save(user);
        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("email={email}")
                .buildAndExpand(user.getEmail())
                .toUri();
        return ResponseEntity.created(headerLocation).build();
    }

    @GetMapping(params = "email")
    public ResponseEntity getUserByEmail(@RequestParam("email") String email){
        Optional<User> user = service.getUserByEmail(email);
        if(user.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(UserResponse.fromModel(user.get()));
    }
}
