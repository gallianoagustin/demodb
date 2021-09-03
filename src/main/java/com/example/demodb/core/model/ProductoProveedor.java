package com.example.demodb.core.model;

import com.example.demodb.core.model.security.BaseModelModificacion;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@EqualsAndHashCode(callSuper = false)
@Data
public class ProductoProveedor extends BaseModelModificacion {

	
    @EmbeddedId
    private ProductoProveedorPK productoProveedorPK;
    
	private String skuProveedor;

	
}
