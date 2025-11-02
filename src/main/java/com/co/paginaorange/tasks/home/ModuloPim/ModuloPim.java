package com.co.paginaorange.tasks.home.ModuloPim;

import com.co.paginaorange.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ModuloPim implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.MENU_PIM));

    }
    public static ModuloPim AdicionaEmpleado(){
        return new ModuloPim();
    }
}
