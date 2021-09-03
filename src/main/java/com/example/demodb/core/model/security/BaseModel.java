package com.example.demodb.core.model.security;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseModel {
	
	@ManyToOne()
    @JoinColumn(name="usuario_alta", nullable=false)	 	
	protected Usuario UsuarioAlta;
	
	@ManyToOne()
    @JoinColumn(name="usuario_modificacion", nullable=false)
	protected Usuario UsuarioModificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date fechaAlta;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date fechaModificacion;

}
