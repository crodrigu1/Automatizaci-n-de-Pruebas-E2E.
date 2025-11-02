package com.co.paginaorange.tasks.home.ModuloDirectory;

import com.co.paginaorange.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionaDirectory implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BOTON_DIRECTORY));
    }
    public static SeleccionaDirectory clicDirectory(){
        return new  SeleccionaDirectory();
    }
}
