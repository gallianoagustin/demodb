package com.example.demodb.core.model;

import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
public class ProductoProveedorPK  implements Serializable{

	private static final long serialVersionUID = -5207157232219073159L;
	
	@ManyToOne()
    @JoinColumn(name="id_producto", nullable=false)		
	private Producto producto;

	@ManyToOne()
    @JoinColumn(name="id_tienda", nullable=false)	
	private Tienda tienda;

	public ProductoProveedorPK(Producto producto, Tienda tienda) {
		super();
		this.producto = producto;
		this.tienda = tienda;
	}

	public ProductoProveedorPK() {
		super();
	}
	
	
}
