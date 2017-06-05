package com.snafx.builder;

import lombok.*;

@Builder
@Data
@AllArgsConstructor

public class User {

//    mozna dowolnie modyfikowac gettery, setter, buildera, toStringa etc
//    @Getter(value = AccessLevel.PRIVATE)

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;


}
