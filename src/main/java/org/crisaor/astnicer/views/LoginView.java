/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astnicer.views;


import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Tag("sa-login-view")
@Route(value = LoginView.ROUTE)
@PageTitle("Login")
public class LoginView extends VerticalLayout implements BeforeEnterObserver  {
	public static final String ROUTE = "login";

	private LoginOverlay login = new LoginOverlay();

	public LoginView(){
		login.setAction("login");
		login.setOpened(true);
		login.setTitle("Spring Secured Vaadin");
		login.setDescription("Login Overlay Example");
		getElement().appendChild(login.getElement());
	}

	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		login.setError(event.getLocation().getQueryParameters().getParameters().containsKey("error"));
	}
}

