package org.dis;

import com.google.gson.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;

@CssImport("../src/main/style.css")
@Route
public class MainView extends VerticalLayout {
    private final IPRepository repo;

    private Dialog resultado =  new Dialog();
    private VerticalLayout resultadoLayout = new VerticalLayout();
    private H3 resultadoHead = new H3();
    private Paragraph resultadoText = new Paragraph();

    private H3 formHead = new H3();
    private TextField formText = new TextField();
    private Button editarButton= new Button("Convertir ip",buttonClickEvent -> {resultado.open();});



    public MainView(IPRepository repo) {
        this.repo = repo;

        addClassName("list-view");
        setSizeFull();

        resultadoLayout.add(resultadoHead,resultadoText)
        resultado.add(formHead,formText,resultadoLayout);
        add(resultado);
    }


}