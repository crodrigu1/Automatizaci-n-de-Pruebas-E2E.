package com.co.paginaorange.stepdefinitions.login;

import com.co.paginaorange.interactions.BotonLogin;
import com.co.paginaorange.tasks.logueo.LogueoTask;
import com.co.paginaorange.utils.Navigator;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;





public class LogueoStepDefinitions {
    @Dado("que el usuario abre la página de inicio de sesión de OrangeHRM")
    public void abrirUrl(){
        WebDriver driver = Navigator.onTheWeb().getDriver();
        OnStage.theActorCalled("usuario").can(BrowseTheWeb.with(driver));
    }
    @Cuando("ingresa el nombre de usuario y la contraseña")
    public void ingresaCredenciales(){
        OnStage.withCurrentActor(LogueoTask.Logueo());
    }
    @Y("hace clic en el botón de inicio de sesión")
    public void clicBotonLogin(){
        OnStage.withCurrentActor(BotonLogin.clicBotonLogin());

    }



}
