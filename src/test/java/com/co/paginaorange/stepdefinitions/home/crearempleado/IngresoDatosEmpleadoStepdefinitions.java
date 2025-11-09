package com.co.paginaorange.stepdefinitions.home.crearempleado;


import com.co.paginaorange.models.Empleado;
import com.co.paginaorange.tasks.home.DatosEmpleado.IngresarDatosEmpleado;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;


public class IngresoDatosEmpleadoStepdefinitions {

    @Y("ingresa los datos del nuevo empleado:")
    public void ingresoDatosEmpleado(DataTable dataTable) {
        List<Map<String, String>> datos = dataTable.asMaps();
        Empleado empleado = new Empleado(
                datos.get(0).get("nombre"),
                datos.get(0).get("segundoNombre"),
                datos.get(0).get("apellido")

        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarDatosEmpleado.conDatosDel(empleado)
        );
    }
    }
