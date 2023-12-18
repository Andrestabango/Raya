package com.tresraya.application.views.raya;

import com.tresraya.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Raya")
@Route(value = "raya", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class RayaView extends Composite<VerticalLayout> {

    public RayaView() {
        Button buttonPrimary = new Button();
        HorizontalLayout layoutRow = new HorizontalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        TextField textField4 = new TextField();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        TextField textField7 = new TextField();
        VerticalLayout layoutColumn6 = new VerticalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Reiniciar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn2.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        textField.setLabel("Text field");
        textField.setWidth("min-content");
        textField2.setLabel("Text field");
        textField2.setWidth("min-content");
        textField3.setLabel("Text field");
        textField3.setWidth("min-content");
        layoutColumn5.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn5);
        layoutColumn5.setWidth("100%");
        layoutColumn5.getStyle().set("flex-grow", "1");
        textField4.setLabel("Text field");
        textField4.setWidth("min-content");
        layoutColumn4.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth("501px");
        layoutColumn4.getStyle().set("flex-grow", "1");
        textField5.setLabel("Text field");
        textField5.setWidth("min-content");
        textField6.setLabel("Text field");
        textField6.setWidth("min-content");
        textField7.setLabel("Text field");
        textField7.setWidth("min-content");
        layoutColumn6.setWidthFull();
        layoutColumn4.setFlexGrow(1.0, layoutColumn6);
        layoutColumn6.setWidth("100%");
        layoutColumn6.getStyle().set("flex-grow", "1");
        getContent().add(buttonPrimary);
        getContent().add(layoutRow);
        layoutRow.add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(layoutColumn3);
        layoutColumn3.add(textField);
        layoutColumn3.add(textField2);
        layoutColumn3.add(textField3);
        layoutColumn2.add(layoutColumn5);
        layoutRow2.add(textField4);
        layoutRow2.add(layoutColumn4);
        layoutColumn4.add(textField5);
        layoutColumn4.add(textField6);
        layoutColumn4.add(textField7);
        layoutColumn4.add(layoutColumn6);
    }
}
