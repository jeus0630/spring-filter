package com.example.springfilter.controller;

import com.example.springfilter.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/temp")
public class ApiUserController {

    @PostMapping
    public User user(@RequestBody User user){
        log.info("User : {}", user);
        return user;
    }

    @GetMapping
    public void get(){

    }
}
