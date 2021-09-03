package com.example.demodb.core.model.security;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseModelAlta {
	
	@ManyToOne()
    @JoinColumn(name="usuario_alta", nullable=false)	 	
	protected Usuario UsuarioAlta;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date fechaAlta;


}
