package ui.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import ui.pages.Locators;
import ui.utilities.Driver;

public class US_007StepDefination {

    Actions actions = new Actions(Driver.getDriver());
    Locators locators = new Locators();
    String fabricLinkText = "";

    @And("Sayfanin en altinda bulunan bir linke tiklar.")
    public void sayfanin_en_altinda_bulunan_bir_linke_tiklar() {
        actions.sendKeys(Keys.END).perform();
        fabricLinkText =  locators.fabricLink.getText();
        int spaceIndex = fabricLinkText.indexOf("S");
        fabricLinkText = fabricLinkText.substring(0, spaceIndex-1);

        locators.fabricLink.click();
        String str1 = Driver.getDriver().getTitle();
    }

    @Then("Acilan sayfanin tikladigi link ile eslestigini kontrol eder.")
    public void acilanSayfaninTikladigiLinkIleEslestiginiKontrolEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(fabricLinkText));
    }
}
