package pages;

public class PaginaPrincipal extends BasePage {

    private String elementoBuild = "//select[@id='selectBuild']";
    private String elementoFirstnumber = "//input[@id='number1Field']";
    private String elementoSecondnumber = "//input[@id='number2Field']";
    private String elementoOperation = "//select[@id='selectOperationDropdown']";
    private String elementoCalculate = "//input[@id='calculateButton']";
    private String elementoAnswer = "//input[@id='numberAnswerField']";
    private String elementoClear = "//input[@id='clearButton']";
    private String elementoIntegerOnly = "//input[@id='integerSelect']";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToBasicCalculator() {
        navigateTo("https://testsheepnz.github.io/BasicCalculator.html");
    }

    public void cambiarBuild(String opcionBUilda) {
        selectFromDropdownByValue(elementoBuild, opcionBUilda);
    }

    public void FristNumber(String number) {
        write(elementoFirstnumber, number);
    }

    public void SecondNumber(String number) {
        write(elementoSecondnumber, number);
    }

    public void selectOperationAdd() {
        selectFromDropdownByIndex(elementoOperation, 0);
    }

    public void selectOperationSubtract() {
        selectFromDropdownByIndex(elementoOperation, 1);
    }

    public void selectOperationMultiply() {
        selectFromDropdownByIndex(elementoOperation, 2);
    }

    public void selectOperationConcatenate() {
        selectFromDropdownByIndex(elementoOperation, 3);
    }

    public void calculateButton() {
        clickElement(elementoCalculate);
    }

    public String getAnswer() {
        return getInputValue(elementoAnswer);
    }

    public void ClearButton() {
        clickElement(elementoClear);
    }

    public void IntegerOnly() {
        clickElement(elementoIntegerOnly);
    }

    public String getFirstNumber() {
        return getInputValue(elementoFirstnumber);
    }

    public String getSecondNumber() {
        return getInputValue(elementoSecondnumber);
    }
}
