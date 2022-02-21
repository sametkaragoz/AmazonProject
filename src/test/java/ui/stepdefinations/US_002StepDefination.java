package ui.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import ui.pages.Locators;
import ui.utilities.ConfigurationReader;
import ui.utilities.Driver;

import java.security.Key;

public class US_002StepDefination {

    Locators locators = new Locators();
    Actions actions = new Actions(Driver.getDriver());

    @When("Sag ustteki 'Hello, Sign in' butonuna basar.")
    public void sag_ustteki_butonuna_basar() {
        locators.accountAndListsButton.click();
    }

    @And("Acilan sayfadaki ilgili kutucuga gecerli e-mail ya da telefon numarasini girer. Continue butonuna basar.")
    public void acilanSayfadakiIlgiliKutucugaGecerliEMailYaDaTelefonNumarasiniGirerContinueButonunaBasar() {
        locators.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
        actions.sendKeys(Keys.ENTER).perform();
    }

    @And("Acilan sayfadaki ilgili kutucuga gecerli passwordu girer. Sign-in butonuna basar.")
    public void acilanSayfadakiIlgiliKutucugaGecerliPassworduGirerSignInButonunaBasar() {
        locators.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("Acilan sayfada 'Hello 'username'' yazdigi dogrulanir.")
    public void acilanSayfadaHelloUsernameYazdigiDogrulanir() {
        Assert.assertTrue(locators.helloUsernameYazisiElementi.isDisplayed());
    }

    @And("Acilan sayfadaki ilgili kutucuga gecersiz e-mail ya da telefon numarasini girer. Continue butonuna basar.")
    public void acilanSayfadakiIlgiliKutucugaGecersizEMailYaDaTelefonNumarasiniGirerContinueButonunaBasar() {
        locators.emailBox.sendKeys(ConfigurationReader.getProperty("inv-email"));
        actions.sendKeys(Keys.ENTER).perform();
    }

    @And("Gecersiz e-mail ya da telefon numarasi hata mesaji alindigi kontrol edilir.")
    public void gecersizEMailYaDaTelefonNumarasiHataMesajiAlindigiKontrolEdilir() {
        Assert.assertTrue(locators.errorMessageBox.isDisplayed());
    }

    @And("Kullanici gecerli e-mail ya da telefon numarasini girer. Continue butonuna basar.")
    public void kullaniciGecerliEMailYaDaTelefonNumarasiniGirerContinueButonunaBasar() throws InterruptedException {
        locators.emailBox.click();
        Driver.holdBackSpace(30);
        locators.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
        actions.sendKeys(Keys.ENTER).perform();
    }

    @And("Acilan sayfadaki ilgili kutucuga gecersiz passwordu girer. Sign-In butonuna basar.")
    public void acilanSayfadakiIlgiliKutucugaGecersizPassworduGirerSignInButonunaBasar() {
        locators.passwordBox.sendKeys(ConfigurationReader.getProperty("inv-password"));
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("Gecersiz password hata mesaji alindigi kontrol edilir.")
    public void gecersizPasswordHataMesajiAlindigiKontrolEdilir() {
        Assert.assertTrue(locators.errorMessageBox.isDisplayed());
    }
}
