package com.snafx.dao;

import com.snafx.builder.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);
}
