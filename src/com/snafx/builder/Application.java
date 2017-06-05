package com.snafx.builder;

public class Application {
    public static void main(String[] args) {

        User user = User.builder()
                .firstName("Marian")
                .lastName("Kupa")
                .phoneNumber("666-777-8888")
                .age(66)
                .build();

        System.out.println(user);
    }
}
