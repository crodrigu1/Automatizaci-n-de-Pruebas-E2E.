package com.co.paginaorange.stepdefinitions.home.crearempleado;

import com.co.paginaorange.interactions.BotonGuardarEmpleado;
import com.co.paginaorange.tasks.home.ModuloAddEmployee.ModuloAdicionarEmpleado;
import com.co.paginaorange.tasks.home.ModuloPim.ModuloPim;
import com.co.paginaorange.tasks.home.FotoEmpleado.SubirFotoEmpleado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

public class AdicionaEmpleadoStepDefinitions {
    @Dado("que el usuario se encuentra en el módulo PIM")
    public void SeleccionaMenuPim(){
        OnStage.withCurrentActor(ModuloPim.AdicionaEmpleado());
    }
    @Cuando("selecciona la opción Add Employee")
    public void SeleccionaAddEmployee(){
        OnStage.withCurrentActor(ModuloAdicionarEmpleado.opcionAddEmployee());
    }
    @Y("carga una foto de perfil desde el archivo {string}")
    public void cargarFotoPerfil(String nombreArchivo){
        OnStage.theActorInTheSpotlight().attemptsTo(SubirFotoEmpleado.conNombre(nombreArchivo));
    }
    @Y("guarda la información del empleado")
    public void guardarDatosEmpleado(){
        OnStage.withCurrentActor(BotonGuardarEmpleado.clicBotonGuardar());
    }
}

