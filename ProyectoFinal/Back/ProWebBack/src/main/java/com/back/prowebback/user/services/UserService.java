package com.back.prowebback.user.services;

import com.back.prowebback.user.model.User;
import com.back.prowebback.user.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(String name){
        userRepository.save(new User().setName(name));
    }
}
