package com.example.demodb.core.model;

import com.example.demodb.core.model.security.BaseModelModificacion;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class TasaIva extends BaseModelModificacion {
	
	@Id
	private Long id;
	private Integer codigoAfip;
	private Double inscripto;
	private Double noInscripto;
	private boolean activo;

}
