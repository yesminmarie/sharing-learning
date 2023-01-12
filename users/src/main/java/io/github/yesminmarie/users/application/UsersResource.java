package io.github.yesminmarie.users.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersResource {

    @GetMapping
    public String status(){
        return "ok";
    }

}
