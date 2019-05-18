package com.test.authentication;

import com.test.authentication.domain.LoginResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class Authentication {

    @RequestMapping(value = "/login", method = POST)
    public LoginResponse login() {
        return new LoginResponse(UUID.randomUUID().toString());
    }

    @RequestMapping(value = "/logout", method = POST)
    public LoginResponse logout() {
        return new LoginResponse("");
    }
}