package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/TransferenciasBancos.feature"
        , glue = {"stepdefinitions"}
        , tags = "@Regresion or @SmokeTest"
        , plugin = {"pretty", "html:target/cucumber/reportebancos.html", "json:target/TransferenciasBancosRunner.json"})
public class TransferenciasBancosRunner {


}
