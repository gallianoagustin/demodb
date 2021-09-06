package com.example.demodb.ui;

import com.example.demodb.core.model.Producto;
import com.example.demodb.core.model.dto.IProductoBuscadora;
import com.example.demodb.core.service.IProductoService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.CallbackDataProvider;
import com.vaadin.flow.data.provider.ConfigurableFilterDataProvider;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.router.Route;
import de.mekaso.vaadin.addon.compani.AnimatedComponent;
import de.mekaso.vaadin.addon.compani.Animator;
import de.mekaso.vaadin.addon.compani.animation.AnimationBuilder;
import de.mekaso.vaadin.addon.compani.animation.AnimationTypes;
import de.mekaso.vaadin.addon.compani.effect.EntranceEffect;
import de.mekaso.vaadin.addon.compani.effect.ExitEffect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.List;

import static com.vaadin.flow.spring.data.VaadinSpringDataHelpers.toSpringDataSort;


@Route
public class MainView extends VerticalLayout {


    private IProductoService iProductoService;
    private ConfigurableFilterDataProvider<IProductoBuscadora, Void, String> dataProvider;
    private String filterField;
    private SplitLayout splitLayout;

    @Autowired
    public MainView(IProductoService iProductoService) {
        /*
        this.iProductoService=iProductoService;

        List<Producto> lista = iProductoService.findFirst10ByNombre("ADHESIVO LA GOTITA  2 ML");

        Grid<Producto> grilla = new Grid<>(Producto.class);
        grilla.setItems(lista);

        add(grilla);
         */

        final Animator animator = Animator.init(UI.getCurrent());


        Grid<IProductoBuscadora> grid = new Grid<>(IProductoBuscadora.class);
        CallbackDataProvider<IProductoBuscadora,String> callbackDataProvider = DataProvider.fromFilteringCallbacks(
                query -> {
                    return iProductoService.findBuscadora(PageRequest.of(query.getPage(), query.getPageSize(), toSpringDataSort(query))).stream();

                },
                query -> {
                  return iProductoService.countBuscadora();
                }
        );

        dataProvider = callbackDataProvider.withConfigurableFilter();
        grid.setItems(dataProvider);

        //add(grid);

        setSizeFull();

        grid.setSizeFull();

        Button btn = new Button("Ejecutar");
        Button btn2 = new Button("CERRAR",a -> {splitLayout.setSplitterPosition(100d);
            AnimatedComponent animatedLabel = animator.prepareComponent(grid);
            animatedLabel.animate(
                    AnimationBuilder
                            .createBuilder()
                            .create(AnimationTypes.ExitAnimation.class)
                            .withEffect(ExitEffect.fadeOutLeftBig));
        });

        btn.addClickListener(
                a -> {splitLayout.setSplitterPosition(0d);
                AnimatedComponent animatedLabel = animator.prepareComponent(grid);
        animatedLabel.animate(
                AnimationBuilder
                        .createBuilder()
                        .create(AnimationTypes.EntranceAnimation.class)
                        .withEffect(EntranceEffect.fadeInRightBig));
        });

        VerticalLayout verticalLayout = new VerticalLayout(btn,btn2);

        splitLayout = new SplitLayout(verticalLayout,grid);

        splitLayout.setSizeFull();

        splitLayout.setSplitterPosition(100d);
        add(splitLayout);
    }



}
