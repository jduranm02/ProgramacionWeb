package com.back.prowebback.rol.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PermissionsDTO {

    private Integer id;

    private String name;

    private String description;

    private Boolean active;

}
