package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class TransferenciasSteps {

    private int horarioEsperado;
    @Given("un usuario requiere realizar una transferencia interbancaria")
    public void unUsuarioRequiereRealizarUnaTransferenciaInterbancaria() {
        System.out.println("INICIA PRUEBA");
    }

    @When("realiza la transferencia antes de las {int} pm")
    public void realizaLaTransferenciaAntesDeLasPm(int horario) {
        horarioEsperado = horario;
        System.out.println("PASO 1"+horarioEsperado);
    }

    @Then("la transferencia es exitosa")
    public void laTransferenciaEsExitosa() {
        Assert.assertEquals(horarioEsperado, 2);
        System.out.println("FINALIZA PRUEBA");
    }

    @And("la cuenta destino es del {string}")
    public void laCuentaDestinoEsDel(String banco) {
        System.out.println("ENTIDAD BANCARIA: "+banco);
    }

    @When("realiza la transferencia despues de las {int} pm")
    public void realizaLaTransferenciaDespuesDeLasPm(int horario) {
        System.out.println("PASO 2");
    }

    @Then("la transferencia es fallida")
    public void laTransferenciaEsFallida() {
        System.out.println("FIN DE LA PRUEBA FALLIDA");
    }

    @Dado("que existe un usuario con cuenta de ahorro")
    public void queExisteUnUsuarioConCuentaDeAhorro() {
    }

    @Y("la cuenta de ahorro tiene saldo")
    public void laCuentaDeAhorroTieneSaldo() {
    }

    @Cuando("el usuario retira un monto menor al saldo")
    public void elUsuarioRetiraUnMontoMenorAlSaldo() {
    }

    @Entonces("el retiro es exitoso")
    public void elRetiroEsExitoso() {
    }
}
