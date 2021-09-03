package com.example.demodb.core.model;

import com.example.demodb.core.model.security.BaseModelModificacion;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class ProductoFuente extends BaseModelModificacion {

    @EmbeddedId
    private ProductoFuentePK productoFuentePK;
	
	private String url;
	
}
