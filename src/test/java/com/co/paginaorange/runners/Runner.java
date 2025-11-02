package com.co.paginaorange.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/empleado.feature",
        glue = "com.co.paginaorange.stepdefinitions",
        tags = "@CrearEmpleado",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
