package com.misha.customer;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email) {}
