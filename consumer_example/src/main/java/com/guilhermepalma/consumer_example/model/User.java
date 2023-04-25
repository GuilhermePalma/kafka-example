package com.guilhermepalma.consumer_example.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {

    private String name;

    private String email;
    private String password;

}
