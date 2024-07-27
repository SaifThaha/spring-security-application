package com._xtech.controller;

import com._xtech.model.User;
import com._xtech.service.RegistrationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("user")
    @ResponseStatus(HttpStatus.OK)
    public User registerUser(@Valid @RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return registrationService.registerUser(user);
    }
}
