package com.guilhermepalma.producer_example.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {

    private String name;

    private String email;
    private String password;

    private String description;
    private String role;

}
