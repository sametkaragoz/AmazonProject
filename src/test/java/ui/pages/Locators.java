package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//a[@aria-label='Open Menu']")
    public WebElement allMenuButton;

    @FindBy(xpath = "//div[contains(text(), 'Computers')]")
    public WebElement computersMenuButton;

    @FindBy(xpath = "//li//div[text()='computers']")
    public WebElement computersMenuYazisiElementi;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[*]/a")
    public List<WebElement> computersSublistWebElement;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[*]//*/h2/a/span")
    public List <WebElement> searcResultDescriptionsList;

    @FindBy(xpath = "//h4[text()='Important Message!']")
    public WebElement importantMessageBox;

    @FindBy(xpath = "//span[text()='Mountain Bikes']")
    public WebElement mountainBikesFilterButton;

    @FindBy(xpath = "//span[text()='Aluminum']")
    public WebElement aluminumFilterButton;

    @FindBy(xpath = "//select[@name='s']")
    public WebElement sortBySelectObject;

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
