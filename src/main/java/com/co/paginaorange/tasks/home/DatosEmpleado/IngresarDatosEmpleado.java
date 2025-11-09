package com.co.paginaorange.tasks.home.DatosEmpleado;

import com.co.paginaorange.models.Empleado;
import com.co.paginaorange.userinterface.datosempleado.DatosEmpleadoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDatosEmpleado implements Task {

    private final Empleado empleado;

    public IngresarDatosEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public static IngresarDatosEmpleado conDatosDel(Empleado empleado) {
        return instrumented(IngresarDatosEmpleado.class, empleado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(empleado.getNombre()).into(DatosEmpleadoPage.FIRST_NAME),
                Enter.theValue(empleado.getSegundoNombre()).into(DatosEmpleadoPage.MIDDLE_NAME),
                Enter.theValue(empleado.getApellido()).into(DatosEmpleadoPage.LAST_NAME),
                Click.on(DatosEmpleadoPage.CAMPO_ADICIONAR_IMAGEN_EMPLEADO)
        );


    }

}