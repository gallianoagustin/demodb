package com.example.demodb.core.model;

import com.example.demodb.core.model.security.BaseModelModificacion;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = false)
@Data
public class Tienda extends BaseModelModificacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTienda;
	
	@Column(unique = true, nullable = false)
	private String bandera;
	
	private String razonSocial;

	@ManyToOne()
	@JoinColumn(name="id_tipotienda", nullable=true)
	private TipoTienda tipoTienda;

}
