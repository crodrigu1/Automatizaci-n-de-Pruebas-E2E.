package com.co.paginaorange.tasks.home.DatosEmpleado;

import com.co.paginaorange.userinterface.datosempleado.DatosEmpleadoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatosEmpleado implements Task {

   private final String nombreEmpleado;
   private final String segundoNombreEmpleado;
   private final String apellidoEmpleado;
   private final String numeroIdentificacion;

    public IngresarDatosEmpleado(String nombreEmpleado, String segundoNombreEmpleado, String apellidoEmpleado, String numeroIdentificacion) {
        this.nombreEmpleado = nombreEmpleado;
        this.segundoNombreEmpleado = segundoNombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public static IngresarDatosEmpleado DatosEmpleado(String nombreEmpleado, String segundoNombreEmpleado, String apellidoEmpleado, String numeroIdentificacion){
        return new IngresarDatosEmpleado( nombreEmpleado, segundoNombreEmpleado, apellidoEmpleado, numeroIdentificacion);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {



      actor.attemptsTo(Click.on(DatosEmpleadoPage.FIRST_NAME));
       actor.attemptsTo(Enter.theValue(nombreEmpleado).into(DatosEmpleadoPage.FIRST_NAME));
        actor.attemptsTo(Click.on(DatosEmpleadoPage.MIDDLE_NAME));
        actor.attemptsTo(Enter.theValue(segundoNombreEmpleado).into(DatosEmpleadoPage.MIDDLE_NAME));
        actor.attemptsTo(Click.on(DatosEmpleadoPage.LAST_NAME));
        actor.attemptsTo(Enter.theValue(apellidoEmpleado).into(DatosEmpleadoPage.LAST_NAME));
        actor.attemptsTo(Click.on(DatosEmpleadoPage.CAMPO_ADICIONAR_IMAGEN_EMPLEADO));

    }
}
