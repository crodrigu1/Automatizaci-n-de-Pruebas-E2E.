package com.co.paginaorange.tasks.home.BusquedaEmpleado;

import com.co.paginaorange.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarEmpleado implements Task {

    private final String nombreEmpleado;

    public BuscarEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public static BuscarEmpleado conNombre(String nombreEmpleado) {
        return new BuscarEmpleado(nombreEmpleado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(nombreEmpleado).into(HomePage.CAMPO_EMPLOYEE_NAME),


                WaitUntil.the(HomePage.SELECCIONA_EMPLOYEE_NAME.of(nombreEmpleado), isVisible())
                        .forNoMoreThan(10).seconds(),


                Click.on(HomePage.SELECCIONA_EMPLOYEE_NAME.of(nombreEmpleado)));

    }

}
