package com.example.demodb.core.model.security;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "config_area")
public class ConfigArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String area;
    private String nombre;

    private String icon;

    private Integer orden;

    @OneToMany(mappedBy = "configArea", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<ConfigSubArea> configSubAreaList;


}
