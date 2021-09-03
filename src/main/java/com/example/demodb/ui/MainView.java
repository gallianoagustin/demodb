package com.example.demodb.ui;

import com.example.demodb.core.model.Producto;
import com.example.demodb.core.service.IProductoService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Route
public class MainView extends VerticalLayout {


    private IProductoService iProductoService;

    @Autowired
    public MainView(IProductoService iProductoService) {
        this.iProductoService=iProductoService;

        List<Producto> lista = iProductoService.findFirst10ByNombre("ADHESIVO LA GOTITA  2 ML");

        Grid<Producto> grilla = new Grid<>(Producto.class);
        grilla.setItems(iProductoService.findAll());

        add(grilla);

    }


}
