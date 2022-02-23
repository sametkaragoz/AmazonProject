package ui.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import ui.pages.Locators;
import ui.utilities.ConfigurationReader;
import ui.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class US_003StepDefination {

    Locators locators = new Locators();
    Actions actions = new Actions(Driver.getDriver());

    @And("Gecerli kullanici bilgileri ile sisteme giris yapar.")
    public void gecerli_kullanici_bilgileri_ile_sisteme_giris_yapar() {
        //do {
        //    Driver.getDriver().get("https://www.amazon.ca/");
        //    locators.accountAndListsButton.click();
        //    locators.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
        //    actions.sendKeys(Keys.ENTER).perform();
        //    locators.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        //    actions.sendKeys(Keys.ENTER).perform();
        //    if (locators.importantMessageBox.isDisplayed()) {
                //Driver.getDriver().get("https://www.amazon.com/");
                locators.accountAndListsButton.click();
                locators.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
                actions.sendKeys(Keys.ENTER).perform();
                locators.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
                actions.sendKeys(Keys.ENTER).perform();
      //      }
      //  } while (!(locators.importantMessageBox.isDisplayed()));
    }

    @And("Amazon logosu altindaki ALL menusune tiklar.")
    public void amazonLogosuAltindakiALLMenusuneTiklar() {
        locators.allMenuButton.click();
    }

    @And("Acilan menulerde Shop By Department sekmesi altindaki Computers kategorisine tiklar.")
    public void acilanMenulerdeShopByDepartmentSekmesiAltindakiComputersKategorisineTiklar() throws InterruptedException {
        locators.computersMenuButton.click();
        Driver.wait(2);
    }

    @Then("Acilan menunun Computers kategorisine ait oldugunu kontrol eder.")
    public void acilanMenununComputersKategorisineAitOldugunuKontrolEder() {
        Assert.assertTrue(locators.computersMenuYazisiElementi.isDisplayed());
    }

    @Then("Computers kategorisi altinda 15 adet alt kategorinin isimleriyle beraber listelendigini kontrol eder.")
    public void computersKategorisiAltinda15AdetAltKategorininIsimleriyleBeraberListelendiginiKontrolEder() throws InterruptedException {
        Driver.wait(1);
        String arr [] = {"Computer Accessories & Peripherals", "Computer Components",
                "Computers & Tablets", "Data Storage", "External Components", "Laptop Accessories", "Monitors", "Networking Products", "Power Strips & Surge Protectors",
                "Printers", "Scanners", "Servers", "Tablet Accessories", "Tablet Replacement Parts", "Warranties & Services"};
        List <String> expectedSublist = Arrays.asList(arr);
        List <String> computersSublist = new ArrayList<>();
        for (int i = 0 ; i<locators.computersSublistWebElement.size(); i++) {
            computersSublist.add(locators.computersSublistWebElement.get(i).getText());
        }
        computersSublist.remove(0);
        Assert.assertEquals(computersSublist, expectedSublist);

    }
}