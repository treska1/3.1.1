package com.example.app.service;

import com.example.app.model.User;


import java.util.List;

public interface UserService {

    List getAllUsers();

    void saveUser(User user);

    User getUserById(long id);

    void removeUser(long id);

    void updateUser(User user);
}
