package com.uis.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "tiposdocumento")
public class TipoDocumento{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tiposdocumento_id")
	private long id;

	@OneToOne(mappedBy = "tipoDocumentoId")
	private Persona persona;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

}
