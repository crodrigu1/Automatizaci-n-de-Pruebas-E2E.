package com.co.paginaorange.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Navigator {

    private static WebDriver myDriver; // Instancia única del WebDriver
    private static boolean isInitialized = false; // Flag para controlar inicialización
    private static final String APP_URL =
            "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; // URL

    private Navigator() {
        // Evita instanciación externa
    }

    public static Navigator onTheWeb() {
        return new Navigator();
    }

    public WebDriver getDriver() {
        if (!isInitialized || myDriver == null) {
            System.out.println("🌐 Iniciando nuevo navegador para el escenario...");
            WebDriverManager.chromedriver().setup();


            // Opciones de Chrome
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--start-maximized");
            options.addArguments("--disable-extensions");
            options.addArguments("--remote-allow-origins=*");


            myDriver = new ChromeDriver(options);
            myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Abrir URL inicial
            myDriver.get(APP_URL);

            isInitialized = true;
        } else {
            System.out.println(" Reutilizando navegador ya inicializado (mismo escenario).");
        }
        return myDriver;
    }

    public static void resetDriver() {
        if (myDriver != null) {
            System.out.println("Cerrando navegador...");
            myDriver.quit();
        }
        myDriver = null;
        isInitialized = false;
    }
}
