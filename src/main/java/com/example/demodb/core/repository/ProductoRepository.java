package com.example.demodb.core.repository;


import com.example.demodb.core.model.Producto;
import com.example.demodb.core.model.dto.IProductoBuscadora;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, String>, JpaSpecificationExecutor<Producto> {


    @Query(value = "select count(pro.id_producto) "+
            "from producto pro " +
            "inner join producto_proveedor pp on pp.id_producto = pro.id_producto", nativeQuery = true)
    int countBuscadora();


    @Query(value = "select pro.id_producto as idProducto,pro.nombre,pro.EAN13,pp.sku_proveedor as skuProveedor," +
            "pro.temperatura " +
            "from producto pro " +
            "inner join producto_proveedor pp on pp.id_producto = pro.id_producto " +
            "where pp.sku_proveedor like ?1% " +
            "order by pro.id_producto", nativeQuery = true)
    List<IProductoBuscadora> findBuscadoraBySku(Pageable pageable, @Param("codigoSku") String codigoSku);


    @Query(value = "select pro.id_producto as idProducto,pro.nombre,pro.EAN13,pp.sku_proveedor as skuProveedor," +
            "pro.temperatura " +
            "from producto pro " +
            "inner join producto_proveedor pp on pp.id_producto = pro.id_producto " +
            "order by pro.id_producto", nativeQuery = true)
    List<IProductoBuscadora> findBuscadora(Pageable pageable);

//    @Query(value = "from Producto limit 10")
//    List<IProductoBuscadora> findBuscadora(Pageable pageable);


    List<Producto> findFirst10ByNombre(String nombre);
}
