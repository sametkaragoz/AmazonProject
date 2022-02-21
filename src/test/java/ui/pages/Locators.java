package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class Locators {
    public Locators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Account & Lists']")
    public WebElement accountAndListsButton;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[text()='Hello, TEAM15']")
    public WebElement helloUsernameYazisiElementi;

    @FindBy(xpath = "//div[@id='auth-error-message-box']")
    public WebElement errorMessageBox;

    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
//
    //@FindBy(xpath = "")
    //public WebElement aa;
}
