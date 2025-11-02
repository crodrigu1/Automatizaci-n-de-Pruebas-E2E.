package com.co.paginaorange.interactions;

import com.co.paginaorange.userinterface.login.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class BotonLogin implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LoginPage.BOTON_ACEPTAR));
    }
    public static BotonLogin clicBotonLogin(){
        return new BotonLogin();
    }
}
