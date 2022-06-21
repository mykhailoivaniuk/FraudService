package com.misha.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/customer")
public record CustomerController(CustomerService cs){

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest cr){
        log.info("New customer registration + " + cr);
        cs.registerCustomer(cr);
    }
}
