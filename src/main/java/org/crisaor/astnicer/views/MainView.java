/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astnicer.views;

/**
 *
 * @author crisaor
 */
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import org.crisaor.astnicer.security.SecurityUtils;

@StyleSheet("frontend://css/generalTemplate.css")
@Route("")
public class MainView extends Div {
    
    

    public MainView() {
        // Instantiate layouts
        HorizontalLayout header = new HorizontalLayout();
        VerticalLayout navBar = new VerticalLayout();
        VerticalLayout content = new VerticalLayout();
        Div center = new Div();
        HorizontalLayout footer = new HorizontalLayout();
        
        //header
        Label labelName=new Label(SecurityUtils.getUserName());
        
        //Content
        Tab adminTab= new Tab();
        adminTab.setLabel("Admin");
        adminTab.setVisible(SecurityUtils.isAdminUser());
        Tabs tabs = new Tabs();
        Tab userTab = new Tab("Users");
        tabs.add(adminTab,userTab);
        Button button = new Button("Click me");
        //setting  components
        button.addClickListener(click -> {
            Notification.show("Thanks for clicking!");
        }); 
        
        // Configure layouts
        setSizeFull();
        header.setPadding(true);
        header.add(labelName);
        
        footer.setPadding(true);
        addClassName("main-view");
        header.addClassName("header");
        navBar.addClassName("navbar");
        center.addClassName("center");
        content.addClassName("content");
        content.add(tabs);
        content.add(button);
        footer.addClassName("footer");

        // Compose layout
        center.add(navBar, content);
        add(header, center, footer);
    }
}
