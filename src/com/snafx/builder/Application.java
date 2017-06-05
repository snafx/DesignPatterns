package com.snafx.builder;

/**
 * Created by RENT on 2017-06-05.
 */
public class Application {
    public static void main(String[] args) {

        User user = User.builder()
                .firstName("Marian")
                .lastName("Kupa")
                .phoneNumber("666-666-666")
                .age(66)
                .build();

        System.out.println(user);
    }
}
