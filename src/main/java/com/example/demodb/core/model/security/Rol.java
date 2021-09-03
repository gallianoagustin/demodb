package com.example.demodb.core.model.security;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String nombre; //con spring security tiene que tener el prefijo "rol_"

    @ManyToMany(mappedBy = "roles")// solo bidi
    private List<Usuario> usuarios;

}
