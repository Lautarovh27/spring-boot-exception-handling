package com.lautaro.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lautaro.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl(List<User> users) {
        this.users = new ArrayList<>();
        users.add(new User(1, "Lautaro", "Gomez"));
        users.add(new User(2, "Maria", "Perez"));             
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(long id) {
        User user = null;
        for (User u : users) {
            if (u.getId() == id) {
                user = u;
                break;
            }
        }
        return user;
    }


}
