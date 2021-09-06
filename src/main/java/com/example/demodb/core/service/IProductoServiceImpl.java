package com.example.demodb.core.service;

import com.example.demodb.core.model.Producto;
import com.example.demodb.core.model.dto.IProductoBuscadora;
import com.example.demodb.core.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public int countBuscadoraByFilter(String filtrovalor, String filtroField) {
        return 0;
    }

    @Override
    public int countBuscadora() {
        return this.productoRepository.countBuscadora();
    }

    @Override
    public int countBuscadora(String filtroValor, String filtroField) {
        return 0;
    }

    @Override
    public List<IProductoBuscadora> findBuscadora(Pageable pageable) {
        return this.productoRepository.findBuscadora(pageable);
    }



    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

//    @Override
//    public List<Producto> findFirst10ByNombre(String nombre) {
//        return productoRepository.findFirst10ByNombre(nombre);
//    }
}
