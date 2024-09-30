package com.example.application.views.home;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Home")
@Route(value = "")
public class HomeView extends VerticalLayout {

    public HomeView() {
        setSpacing(false);

        Select<String> select = new Select<>();
        select.setItems("Option one", "Option two", "Option three");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.setItems("Option one", "Option two", "Option three");

        Button refreshButton = new Button("Refresh items");
        refreshButton.addClickListener(e -> {
            select.getDataProvider().refreshAll();
            comboBox.getDataProvider().refreshAll();
        });

        add(select, comboBox, refreshButton);
    }

}
