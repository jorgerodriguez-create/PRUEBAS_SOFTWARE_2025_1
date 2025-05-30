package steps;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class SauceDemoSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("Navego a la página de la Calculadora Básica")
    public void iNavigateToFRT() {
        landingPage.navigateToBasicCalculator();
    }

    @When("Ingreso {word} en el campo \"Build\"")
    public void iWriteUsername(String optionBUild) {
        landingPage.cambiarBuild(optionBUild);
    }

    @And("Ingreso {word} en el campo \"Number 1\"")
    public void FristNumber(String number) {
        landingPage.FristNumber(number);
    }

    @And("Ingreso {word} en el campo \"Number 2\"")
    public void SecondNumber(String number) {
        landingPage.SecondNumber(number);
    }

    @And("Selecciono la operación \"Add\"")
    public void iSelectOperationAdd() {
        landingPage.selectOperationAdd();
    }

    @And("Selecciono la operación \"Subtract\"")
    public void iSelectOperationSubtract() {
        landingPage.selectOperationSubtract();
    }

    @And("Selecciono la operación \"Multiply\"")
    public void iSelectOperationMultiply() {
        landingPage.selectOperationMultiply();
    }

    @And("Selecciono la operación \"Concatenate\"")
    public void iSelectOperationConcatenate() {
        landingPage.selectOperationConcatenate();
    }

    @And("Hago clic en el botón \"Calculate\"")
    public void iClickCalculateButton() {
        landingPage.calculateButton();
    }

    @Then("Debería ver {string} como resultado en el campo \"Answer\"")
    public void getAnswer(String expectedResult) {
        String actualResult = landingPage.getAnswer();
        System.out.println("Resultado en 'Answer': '" + actualResult + "'");
        Assert.assertEquals(actualResult, expectedResult, "El resultado no coincide.");
    }

    @And("Hago clic en el botón \"Clear\"")
    public void elementoClear() {
        landingPage.ClearButton();
    }

    @And("Desmarco la casilla \"Integer Only\"")
    public void IntegerOnly() {
        landingPage.IntegerOnly();
    }

    @Then("El campo \"Number 1\" debería estar vacío")
    public void campoNumero1Vacio() {
        String valor = landingPage.getFirstNumber();
        System.out.println("Valor en 'Number 1': '" + valor + "'");
        Assert.assertEquals(valor, "", "El campo Number 1 no está vacío.");
    }

    @Then("El campo \"Number 2\" debería estar vacío")
    public void campoNumero2Vacio() {
        String valor = landingPage.getSecondNumber();
        System.out.println("Valor en 'Number 2': '" + valor + "'");
        Assert.assertEquals(valor, "", "El campo Number 2 no está vacío.");
    }

    @Then("El campo \"Answer\" debería estar vacío")
    public void campoAnswerVacio() {
        String valor = landingPage.getAnswer();
        System.out.println("Valor en 'Answer': '" + valor + "'");
        Assert.assertEquals(valor, "", "El campo Answer no está vacío.");
    }
}
