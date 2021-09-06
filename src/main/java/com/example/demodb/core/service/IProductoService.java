package com.example.demodb.core.service;

import com.example.demodb.core.model.Producto;
import com.example.demodb.core.model.dto.IProductoBuscadora;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductoService {

    int countBuscadoraByFilter(String filtrovalor, String filtroField);

    int countBuscadora();
    int countBuscadora(String filtroValor,String filtroField);

    List<IProductoBuscadora> findBuscadora(Pageable pageable);

    List<Producto>findAll();

//    List<Producto>findFirst10ByNombre(String nombre);

}
