package com.example.demodb.core.model;

import com.example.demodb.core.model.security.BaseModelModificacion;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(
uniqueConstraints=@UniqueConstraint(columnNames={"idCategoria", "id_categoria_padre"}))
public class Categoria extends BaseModelModificacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategoria;
	
	private String nombre;
	
    @ManyToOne()
    @JoinColumn(name="id_categoria_padre", nullable=true)		
	private Categoria padreCategoria;
}
