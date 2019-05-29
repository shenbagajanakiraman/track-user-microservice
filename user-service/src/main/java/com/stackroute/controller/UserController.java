package com.stackroute.controller;


import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsException;
import com.stackroute.userservice.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* @RestController = @Controller + @ResponseBody */



@RestController

@RequestMapping (value = "/api/v1")
public class UserController {
    UserService userService;

    public UserController(UserService userService)
    {

        this.userService = userService;
    }


    //Handler Methods

    @PostMapping ("/user")
    public ResponseEntity<?> saveUser (@RequestBody User user) {

        System.out.println(user.getAge());
        ResponseEntity responseEntity;

        try {
            userService.saveUser(user);
            responseEntity = new ResponseEntity<String> ("Successfully Completed !!!", HttpStatus.CREATED);
        }
        catch (UserAlreadyExistsException e) {
            responseEntity = new ResponseEntity<String> (e.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }


    @GetMapping ("/users")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.OK);
    }

}

