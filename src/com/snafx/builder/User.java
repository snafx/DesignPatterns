package com.snafx.builder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Data

public class User {

//    mozna dowolnie modyfikowac gettery, setter, buildera, toStringa etc
//    @Getter(value = AccessLevel.PRIVATE)

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;


}
