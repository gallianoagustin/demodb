package com.example.demodb.core.model;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
public class ProductoFuentePK implements Serializable{

	private static final long serialVersionUID = -8299772512340591363L;

    @ManyToOne()
    @JoinColumn(name="id_producto", nullable=false)	    	
	private Producto producto;

    @ManyToOne()
    @JoinColumn(name="id_fuente", nullable=false)	    	
    private Fuente fuente;

	public ProductoFuentePK(Producto producto, Fuente fuente) {
		super();
		this.producto = producto;
		this.fuente = fuente;
	}

	public ProductoFuentePK() {
		super();
	}

	
}
