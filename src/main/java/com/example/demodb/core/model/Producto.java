package com.example.demodb.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
//@EqualsAndHashCode(callSuper = false)
@Entity
@Table(indexes = @Index(columnList = "estado"))
public class Producto{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    @Column(unique = true, nullable = false)
    private Long idProducto;


    @Column(unique = true, nullable = false)
    private String skuWeb;                   //ex idProductoWeb , cambiado por Open Business

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Categoria> categorias;

    @ManyToOne()
    @JoinColumn(name="id_marca", nullable=true)
    private Marca marca;

//    @ManyToOne()
//    @JoinColumn(name="id_tipo_dinamismo", nullable=true)
//    private TipoDinamismo tipoDinamismo;

    private String tipoDinamismo;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto",fetch = FetchType.LAZY)
//    private List<Imagen> Imagenes;


    private String nombre;

    private String nombreCorto;


    private	String cantidad;
    private	String cantidadUnidadMedida;

    @Column(nullable = false)
    private Long EAN13;

    @ManyToOne()
    @JoinColumn(name="id_tasa_iva", nullable=true)
    private TasaIva tasaIva;


    @Column(columnDefinition = "varchar(1) default 'I'")
    private String estado;

    private String imagen1;
    private String imagen2;
    private String imagen3;

    private BigDecimal stock;
    private String estadostockMc;
    private String estadostockIpo;


    private Integer uxb;

    @Column(columnDefinition = "varchar(1)")
    protected String pesable;

    @Column(columnDefinition = "boolean default false",nullable = false)
    private Boolean enviadoBO;

    @Column(columnDefinition = "boolean default false",nullable = false)
    private Boolean enviadoUpdateBO;

    private String temperatura;

//    @OneToMany(mappedBy="producto", fetch=FetchType.EAGER, cascade = CascadeType.ALL,orphanRemoval = true)
//    @Fetch(value = FetchMode.SUBSELECT)
//    private Set<ProductoEan13> productoEan13;

    @Transient
    private String skuProveedor;

    @Transient
    private byte[] imagenData;


}
