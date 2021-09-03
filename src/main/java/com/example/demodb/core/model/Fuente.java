package com.example.demodb.core.model;

import com.example.demodb.core.model.security.BaseModelModificacion;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Fuente extends BaseModelModificacion {
	
	public static final Long FUENTE_PRECIOS_CLAROS = 1L;
	public static final Long FUENTE_TU_MAYORISTA_ONLINE = 2L;
	public static final Long FUENTE_SUPER_PLUS = 3L;
	public static final Long FUENTE_PROVEEDURIA_VIRTUAL = 4L;
	
	@Id
	private Long id;
	private String nombre;
	private String url;
	
	public Fuente(Long id) {
		this.id = id;
	}

	public Fuente() {
		super();
	}
	
}

