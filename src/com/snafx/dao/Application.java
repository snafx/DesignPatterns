package com.snafx.dao;

import com.snafx.builder.User;

import java.io.File;
import java.util.List;

public class Application {

    private static final String PATH = "C:\\Users\\RENT\\IdeaProjects\\DesignPatterns\\users";

    public static void main(String[] args) {


        UserDao userDao = new UserDaoInFile(new File(PATH));
        //zmieniamy UserDaoInFile na UserDaoInMemory lub inna nowa
        //baze danych, szybkie przelaczenie sie na nowa baze
        userDao.addUser(User.builder()
        .firstName("Bill")
        .lastName("Gejts")
        .phoneNumber("666-777-888")
        .age(66)
        .build());
        List<User> allUsers = userDao.getAllUsers();
        allUsers.forEach(e -> System.out.println(e));


        //**************************************

//        UserDao userDao2 = new UserDaoInMemory();
//        userDao.addUser(User.builder()
//        .firstName("Franek")
//        .lastName("Cieciowaty")
//        .phoneNumber("666-777-888")
//        .age(66)
//        .build());
//
//        List<User> allUsers = userDao2.getAllUsers();
//        allUsers.forEach(e -> System.out.println(e)); //lambda w celu wyswietlenia po kolei stworzonych userow
//        allUsers.forEach(System.out::println);
    }
}
