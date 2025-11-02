package com.co.paginaorange.userinterface.login;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {


        public static final Target CAMPO_USUARIO = Target.the("Campo Usuario")
                .locatedBy("//input[@name='username']");

        public static final Target CAMPO_CONTRASENA = Target.the("Campo Contraseña")
                .locatedBy("//input[@name='password']");

        public static final Target BOTON_ACEPTAR = Target.the("Botón Aceptar")
                .locatedBy("//button[@type='submit']");
}
