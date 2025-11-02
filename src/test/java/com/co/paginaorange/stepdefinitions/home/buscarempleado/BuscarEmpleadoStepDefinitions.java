package com.co.paginaorange.stepdefinitions.home.buscarempleado;

import com.co.paginaorange.interactions.BotonBuscarEmpleado;
import com.co.paginaorange.question.EmpleadoEncontrado;
import com.co.paginaorange.tasks.home.BusquedaEmpleado.BuscarEmpleado;
import com.co.paginaorange.tasks.home.ModuloDirectory.SeleccionaDirectory;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class BuscarEmpleadoStepDefinitions {
    @Dado("que el usuario navega al módulo Directory")
    public void navegarModuloDirectory(){
        OnStage.withCurrentActor(SeleccionaDirectory.clicDirectory());
    }

    @Cuando("ingresa el nombre del empleado {string} en el filtro de búsqueda")
    public void  ingresaNombre(String nombreEmpleado){
      OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleado.conNombre(nombreEmpleado));
    }
    @Y("ejecuta la búsqueda")
    public void realizaBusqueda(){
     OnStage.withCurrentActor(BotonBuscarEmpleado.buscarEmpleado());
    }

    @Entonces("el sistema debe mostrar el resultado con el empleado {string}")
    public void resultadoBusqueda(String nombreEmpleado) {
            OnStage.theActorInTheSpotlight().should(
                    seeThat(EmpleadoEncontrado.conNombre(nombreEmpleado), equalTo(true))
            );

        }
    }
