package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Transferencias.feature"
        , glue = {"stepdefinitions"}
        , plugin = {"pretty", "html:target/cucumber/reporte", "json:target/TransferenciasRunner.json"})
public class TransferenciasRunner {


}
