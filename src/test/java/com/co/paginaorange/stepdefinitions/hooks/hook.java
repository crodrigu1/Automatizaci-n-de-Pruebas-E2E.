package com.co.paginaorange.stepdefinitions.hooks;

import com.co.paginaorange.utils.Navigator;
import io.cucumber.java.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class hook {

    private WebDriver driver;

    // Antes de cualquier escenario
    @Before(order = 0)
    public void prepararEscenario() {
        // 1. Iniciar el "Stage" para Screenplay
        OnStage.setTheStage(new OnlineCast());

        // 2. Abrir navegador con Navigator
        driver = Navigator.onTheWeb().getDriver();
    }

    // Después de cada paso, tomar captura
    @AfterStep
    public void tomarEvidencia(Scenario scenario) {
        if (driver != null) {
            try {
                byte[] captura = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(captura, "image/png", "Evidencia paso");
            } catch (Exception e) {
                System.out.println("⚠️ No se pudo tomar captura: " + e.getMessage());
            }
        } else {
            System.out.println("⚠️ Driver null, no se guarda evidencia.");
        }
    }

    // Al final del escenario
    @After(order = 0)
    public void cerrarNavegador() {
        if (driver != null) {
            try {
                driver.quit();
                System.out.println("✅ Navegador cerrado correctamente.");
            } catch (Exception e) {
                System.out.println("⚠️ Error al cerrar navegador: " + e.getMessage());
            } finally {
                Navigator.resetDriver();
            }
        }
    }
}
