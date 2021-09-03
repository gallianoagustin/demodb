package com.example.demodb.core.model.security;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "config_sub_area")
public class ConfigSubArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_config_area")
    private ConfigArea configArea;

    @ManyToMany
    @JoinTable(
            name = "config_usuario_sub_area",
            joinColumns = {@JoinColumn(name = "usuario_sub_area_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "usuario_id", referencedColumnName = "id")}
    )
    private List<Usuario> usuarioList;


    @Column(name = "nro_sub_area")
    private String numeroSubArea;

    @Column(name = "desc_sub_area")
    private String descSubArea;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "icon")
    private String icon;

    @Column(name = "stateful")
    private Boolean stateFul;

    @Column(name = "clase")
    private String clase;


}
