package com.shiv.student_gig_platform.controller;


import com.shiv.student_gig_platform.model.User;
import com.shiv.student_gig_platform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    UserService userService;
    UserController(UserService  userService)
    {
        this.userService=userService;
    }

    @PostMapping(path = "/register")
    public ResponseEntity<User> registerUser(@RequestBody User user)
    {
            User savedUser=userService.register(user);
            return ResponseEntity.ok(savedUser);



    }
    @GetMapping(path = "/email/{email}")
    public ResponseEntity<Optional<User>> getUserByEmail(@PathVariable String email)
    {
        return ResponseEntity.ok(userService.getByEmail(email));
    }

}
