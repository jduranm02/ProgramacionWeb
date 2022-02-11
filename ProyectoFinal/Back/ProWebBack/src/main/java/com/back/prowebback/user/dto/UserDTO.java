package com.back.prowebback.user.dto;

import com.back.prowebback.rol.dto.RolDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserDTO {

    private Integer id;

    private String name;

    private String lastName;

    private String username;

    private String password;

    private Boolean active;

    private List<RolDTO> roles;

}
