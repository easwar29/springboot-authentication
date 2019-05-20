package com.test.authentication;

import com.test.authentication.domain.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class Accounts {

    @RequestMapping(value = "/accounts", method = GET)
    public List<Account> accounts() {
        return new ArrayList<>();
    }

}