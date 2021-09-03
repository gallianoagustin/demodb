package com.example.demodb.core.model;

import com.example.demodb.core.model.security.BaseModelModificacion;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Marca extends BaseModelModificacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idMarca;
	
	@Column(unique = true, nullable = false)
    private String nombre;


}


