package com.co.paginaorange.tasks.home.FotoEmpleado;

import com.co.paginaorange.userinterface.datosempleado.DatosEmpleadoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.nio.file.Path;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SubirFotoEmpleado implements Task {

    private final String nombreArchivo;

    public SubirFotoEmpleado(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String rutaImagen = System.getProperty("user.dir") +
                "\\src\\test\\resources\\imagenes\\" + nombreArchivo;

        actor.attemptsTo(WaitUntil.the(DatosEmpleadoPage.CAMPO_ADICIONAR_IMAGEN_EMPLEADO, isPresent())
                        .forNoMoreThan(10).seconds(), Click.on(DatosEmpleadoPage.CAMPO_ADICIONAR_IMAGEN_EMPLEADO),


                Upload.theFile(Path.of(rutaImagen))
                        .to(DatosEmpleadoPage.INPUT_IMAGEN)
        );
    }

    public static SubirFotoEmpleado conNombre(String nombreArchivo) {
        return instrumented(SubirFotoEmpleado.class, nombreArchivo);
    }
}
