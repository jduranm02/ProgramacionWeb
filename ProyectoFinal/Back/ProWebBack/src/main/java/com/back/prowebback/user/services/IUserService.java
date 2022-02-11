package com.back.prowebback.user.services;

import com.back.prowebback.user.dto.UserDTO;
import com.back.prowebback.utils.ResponseDTO;

public interface IUserService {

    ResponseDTO createUser(UserDTO userDTO);

    ResponseDTO editUser(UserDTO userDTO);

    ResponseDTO getUserById(Integer id);

    ResponseDTO deleteUser(Integer id);

}
