package com.snafx.mvc;

import com.snafx.builder.User;

public class AboutController implements Controller {
    @Override
    public Object handle() {
        return new User("Kazio", "Debil", "0-700-323-555", 31);
    }
}
