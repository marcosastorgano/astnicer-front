/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astorganicer.front.views;

/**
 *
 * @author crisaor
 */
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.Text;

@Route
public class MainView extends VerticalLayout {

	public MainView() {
		add(new Text("Welcome to MainView."));
	}

}

