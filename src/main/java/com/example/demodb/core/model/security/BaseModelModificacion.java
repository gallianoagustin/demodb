package com.example.demodb.core.model.security;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseModelModificacion extends BaseModelAlta{
		
	@ManyToOne()
    @JoinColumn(name="usuario_modificacion", nullable=false)
	protected Usuario UsuarioModificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date fechaModificacion;

}
