package com.example.demodb.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class TipoTienda {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idTipoTienda;
	
	@Column(unique = true, nullable = false)
    private String tipo;


}


