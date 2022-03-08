package com.uis.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "documento")
    private int documento;

    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "password")
    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipo_documento_id", referencedColumnName = "id")
    @JsonIgnore
    private TipoDocumento tipoDocumentoId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ciudad_id", referencedColumnName = "id")
    @JsonIgnore
    private Ciudad lugarResidenciaId;
}
