package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[@class='header__nav-item-link'][normalize-space()='Mundo']";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://cnnespanol.cnn.com/");
    }

    public void clickOnSectionNavigationBar(){
        clickElement(sectionLink);
    }
    
}
