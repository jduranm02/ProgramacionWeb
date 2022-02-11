package com.back.prowebback.rol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import net.bytebuddy.agent.builder.AgentBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class RolDTO {

    private Integer id;

    private String name;

    private String description;

    private List<PermissionsDTO> permissions;

}
