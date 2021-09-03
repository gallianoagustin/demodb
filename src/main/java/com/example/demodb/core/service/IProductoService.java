package com.example.demodb.core.service;

import com.example.demodb.core.model.Producto;
import com.example.demodb.core.model.dto.IProductoBuscadora;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductoService {

    int countBuscadora(String filtroValor,String filtroField);

    List<IProductoBuscadora> findBuscadora(Pageable pageable);
    List<IProductoBuscadora> findBuscadoraBySku(Pageable pageable,String filtroValor,String filtroField);

    List<Producto>findAll();

    List<Producto>findFirst10ByNombre(String nombre);

}
