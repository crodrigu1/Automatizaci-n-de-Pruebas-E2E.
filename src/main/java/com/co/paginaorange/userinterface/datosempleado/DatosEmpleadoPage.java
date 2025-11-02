package com.co.paginaorange.userinterface.datosempleado;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DatosEmpleadoPage {
    public static final Target FIRST_NAME = Target.the("Firts Name")
            .locatedBy("//input[@name='firstName']");
    public static final Target MIDDLE_NAME = Target.the("Middle Name")
            .locatedBy("//input[@name='middleName']");
    public static final Target LAST_NAME = Target.the("Last Name")
            .locatedBy("//input[@name='lastName']");
    public static final Target CAMPO_ADICIONAR_IMAGEN_EMPLEADO = Target.the("Last Name")
            .locatedBy("//i[@class='oxd-icon bi-plus']");
    public static final Target INPUT_IMAGEN =
            Target.the("Campo de tipo file para subir imagen")
                    .located(By.cssSelector("input[type='file'].oxd-file-input"));


}
