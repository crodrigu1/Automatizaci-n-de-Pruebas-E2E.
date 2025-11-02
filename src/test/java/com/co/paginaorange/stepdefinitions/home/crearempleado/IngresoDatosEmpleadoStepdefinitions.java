package com.co.paginaorange.stepdefinitions.home.crearempleado;

import com.co.paginaorange.tasks.home.DatosEmpleado.IngresarDatosEmpleado;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class IngresoDatosEmpleadoStepdefinitions {
    @Y("ingresa los datos del nuevo empleado:")
    public void ingresoDatosEmpleado(DataTable dataTable){
        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);

        String nombreEmpleado = datos.get(0).get("Nombre");
        String segundoNombreEmpleado = datos.get(0).get("SegundoNombre");
        String apellidoEmpleado = datos.get(0).get("Apellido");
        String numeroIdentificacion = datos.get(0).get("NumeroIdentificacion");

        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatosEmpleado.DatosEmpleado(nombreEmpleado, segundoNombreEmpleado, apellidoEmpleado, numeroIdentificacion));
    }
}
