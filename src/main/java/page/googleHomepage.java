package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// locating the Webelements
// creating method for the Webelements action. action can be Click Enter text, Validate text

public class googleHomepage {

    WebDriver driver;

    public googleHomepage(WebDriver dr){
        driver =dr;
        PageFactory.initElements(driver,  this );


    }

    @FindBy( id =" APjFqb")
    WebElement searchBar;

    @FindBy( name =" btnK")
    WebElement searchButton;

    @FindBy( xpath =" /html/body/div/header/div[1]/div[1]/div[1]/a")
    WebElement allTab;

    public void enterProduct(String product) {

        searchBar.sendKeys(product);












    }

    public void ClickonSearchButton() {
        searchButton.click();
    }


    public boolean validateAllTab() {

        return allTab.isDisplayed();
    }
}
