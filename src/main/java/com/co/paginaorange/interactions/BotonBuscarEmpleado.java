package com.co.paginaorange.interactions;

import com.co.paginaorange.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class BotonBuscarEmpleado implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Click.on(HomePage.BOTON_BUSCAR_EMPLEADO));
    }
    public static BotonBuscarEmpleado buscarEmpleado(){
        return new BotonBuscarEmpleado();
    }
}
