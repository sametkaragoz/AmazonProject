package ui.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import ui.pages.Locators;
import ui.utilities.ConfigurationReader;
import ui.utilities.Driver;

public class US_008StepDefination {

    Actions actions = new Actions(Driver.getDriver());
    Locators locators = new Locators();

    @And("Account & Lists acilir sekmesinde Create a List linkine tiklar.")
    public void account_lists_acilir_sekmesinde_create_a_list_linkine_tiklar() throws InterruptedException {
        actions.moveToElement(locators.accountAndListsButton).perform();
        locators.createListButton.click();
        Driver.wait(2);
    }

    @And("Yeni Shopping List'e isim verir ve Create List butonuna tiklar.")
    public void yeniShoppingListEIsimVerirVeCreateListButonunaTiklar() throws InterruptedException {
        locators.listNameTextBox.clear();
        locators.listNameTextBox.sendKeys(ConfigurationReader.getProperty("newListName"));
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Driver.wait(1);
    }

    @Then("Your Lists sekmesi altinda yeni olusturulan listenin gorunurlugu test edilir.")
    public void yourListsSekmesiAltindaYeniOlusturulanListeninGorunurluguTestEdilir() {
        String actualNewListName = locators.newListNameElement.getText();
        Assert.assertEquals(actualNewListName, ConfigurationReader.getProperty("newListName"));

    }
}
