package com.test.authentication;

import com.test.authentication.domain.CreateOrUpdateCustomerRequest;
import com.test.authentication.domain.Customer;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class Customers {

    @ResponseStatus(OK)
    @RequestMapping(value = "/customer/{id}", method = GET)
    public Customer readCustomer(@PathVariable("id") String customerId) {
        return new Customer();
    }

    @ResponseStatus(CREATED)
    @RequestMapping(value = "/customer", method = POST)
    public Customer createCustomer(@RequestBody CreateOrUpdateCustomerRequest createOrUpdateCustomerRequest) {
        return new Customer();
    }

    @ResponseStatus(OK)
    @RequestMapping(value = "/customer/{id}", method = PUT)
    public Customer updateCustomer(@RequestBody CreateOrUpdateCustomerRequest createOrUpdateCustomerRequest) {
        return new Customer();
    }

    @ResponseStatus(OK)
    @RequestMapping(value = "/customer/{id}", method = DELETE)
    public void deleteCustomer() {
    }

}