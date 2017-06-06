package com.snafx.mvc;

import com.snafx.builder.User;

public class HomeController implements Controller{

    @Override
    public Object handle() {
        return new User("Marian", "Frajer", "666-777-8888", 66);
    }
}
