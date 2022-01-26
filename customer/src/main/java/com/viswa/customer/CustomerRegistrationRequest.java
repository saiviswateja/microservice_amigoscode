package com.viswa.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
