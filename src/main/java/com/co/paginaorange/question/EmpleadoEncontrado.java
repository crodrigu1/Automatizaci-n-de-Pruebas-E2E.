package com.co.paginaorange.question;

import com.co.paginaorange.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class EmpleadoEncontrado implements Question<Boolean> {

    private final String nombreEsperado;

    public EmpleadoEncontrado(String nombreEsperado) {
        this.nombreEsperado = nombreEsperado;
    }

    public static EmpleadoEncontrado conNombre(String nombreEsperado) {
        return new EmpleadoEncontrado(nombreEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Obtiene el texto y compara directamente
        String nombreMostrado = HomePage.RESULTADO_NOMBRE.resolveFor(actor).getText();
        return nombreMostrado.equalsIgnoreCase(nombreEsperado);
    }
}