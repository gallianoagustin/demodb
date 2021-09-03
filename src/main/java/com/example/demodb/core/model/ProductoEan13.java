package com.example.demodb.core.model;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductoEan13 {

//    @EmbeddedId
//    ProductoEan13PK productoEan13PK;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne()
    @JoinColumn(name="idProducto", nullable=false)
    protected Producto producto;

    @Column(unique = true, nullable = false)
    private Long ean13;


}
