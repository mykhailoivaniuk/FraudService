package com.misha.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository cr) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        cr.save(customer);
    }
}
