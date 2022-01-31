package com.back.prowebback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.back.prowebback.user.model.User;
import com.back.prowebback.user.repositories.UserRepository;

@RestController
public class HomePage {

    private UserRepository userRepository;

    public HomePage(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/home")
    public String homePage(){
        userRepository.save(new User().setName("name"));
        return "Proyecto web";
    }
}
