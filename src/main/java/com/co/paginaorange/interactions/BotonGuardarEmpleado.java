package com.co.paginaorange.interactions;

import com.co.paginaorange.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class BotonGuardarEmpleado implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(HomePage.BOTON_GUARDAR_EMPLEADO));
    }
    public static BotonGuardarEmpleado clicBotonGuardar(){
        return new  BotonGuardarEmpleado();
    }
}
