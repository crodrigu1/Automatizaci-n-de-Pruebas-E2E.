package com.co.paginaorange.tasks.logueo;

import com.co.paginaorange.userinterface.login.LoginPage;
import com.co.paginaorange.utils.UsuarioLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class LogueoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.CAMPO_USUARIO));
        actor.attemptsTo(SendKeys.of(UsuarioLogin.INGRESO_USUARIO).into(LoginPage.CAMPO_USUARIO));
        actor.attemptsTo(Click.on(LoginPage.CAMPO_CONTRASENA));
        actor.attemptsTo(SendKeys.of(UsuarioLogin.INGRESO_CONTRASENA).into(LoginPage.CAMPO_CONTRASENA));
    }
    public static LogueoTask Logueo(){
        return new LogueoTask();
    }
}