package com.co.paginaorange.tasks.home.ModuloAddEmployee;

import com.co.paginaorange.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ModuloAdicionarEmpleado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.MENU_ADD_EMPLOYEE));

    }
    public static ModuloAdicionarEmpleado opcionAddEmployee(){
        return new ModuloAdicionarEmpleado();
    }
}
