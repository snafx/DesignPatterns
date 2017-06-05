package com.snafx.dao;

import com.snafx.builder.User;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UserDaoInMemory implements UserDao{

    private List<User> users;

    public UserDaoInMemory() {

    }

    public UserDaoInMemory(File file) {
    }


    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
