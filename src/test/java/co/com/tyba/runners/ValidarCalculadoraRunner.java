package co.com.tyba.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/validarcalculadora.feature",
        glue = {"co.com"})
public class ValidarCalculadoraRunner {
}
