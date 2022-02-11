package com.back.prowebback.user.services;

import com.back.prowebback.user.dto.UserDTO;
import com.back.prowebback.user.repositories.UserRepository;
import com.back.prowebback.utils.ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseDTO createUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseDTO editUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseDTO getUserById(Integer id) {
        return null;
    }

    @Override
    public ResponseDTO deleteUser(Integer id) {
        return null;
    }
}
