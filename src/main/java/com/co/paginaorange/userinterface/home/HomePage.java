package com.co.paginaorange.userinterface.home;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target LBL_DASHBOARD = Target.the("título del panel principal del Dashboard")
                .located(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6"));

    public static final Target MENU_PIM = Target.the("Selecciona la opción PIM")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));

    public static final Target MENU_ADD_EMPLOYEE = Target.the("Selecciona la opción Add Employee")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a"));

    public static final Target BOTON_GUARDAR_EMPLEADO = Target.the("Selecciona el boton Guardar Datos Empleado")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target BOTON_DIRECTORY = Target.the("Selecciona el boton Directory")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a"));

    public static final Target CAMPO_EMPLOYEE_NAME = Target.the("Campo Employee Name")
            .located(By.xpath("//input[@placeholder='Type for hints...']"));

    public static final Target SELECCIONA_EMPLOYEE_NAME = Target.the("Campo Employee Name")
            .locatedBy("//div[contains(@class,'oxd-autocomplete-option') and contains(.,'{0}')]");


    public static final Target BOTON_BUSCAR_EMPLEADO = Target.the("Campo Employee Name")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target RESULTADO_NOMBRE = Target.the("resultado de búsqueda del empleado")
            .locatedBy("//p[contains(@class,'orangehrm-directory-card-header')]");









}


