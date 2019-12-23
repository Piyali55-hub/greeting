package com.example.greeting.controller;

import com.example.greeting.messaging.UsersClient;
import com.example.greeting.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private final UsersClient usersClient;

    public GreetingController(UsersClient usersClient) {
        this.usersClient = usersClient;
    }

    @GetMapping("/users/id/{id}")
    public String greetUser(@PathVariable long id) {
        User user = usersClient.findUserById(id);
        return "Hello " + user.getName();
    }

}
