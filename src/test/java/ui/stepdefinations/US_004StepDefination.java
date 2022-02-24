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
import java.util.List;
import java.util.Random;

public class US_004StepDefination {

    Locators locators = new Locators();
    Actions actions = new Actions(Driver.getDriver());

    @And("Arama butonuna aranan kelime yazilir ve aranir.")
    public void arama_butonuna_aranan_kelime_yazilir_ve_aranir() {
        locators.searchBox.sendKeys(ConfigurationReader.getProperty("arananKelime"));
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("Listelenen urunlerin basliginin aranan kelimeyi icerdigi test edilir.")
    public void listelenenUrunlerinBasligininArananKelimeyiIcerdigiTestEdilir() throws InterruptedException {
        List <String> resultList = new ArrayList<>();
        Driver.wait(1);
        for (int i = 1 ; i<locators.searcResultDescriptionsList.size() ; i++) {
            resultList.add(locators.searcResultDescriptionsList.get(i).getText());
            if (i%4==0) {
                actions.sendKeys(Keys.PAGE_DOWN).perform();
            }
        }
        Random random = new Random();
        for (int i=0 ; i<10 ; i++) {
            int random1 = random.nextInt(resultList.size());
            System.out.println(random1);
            Assert.assertTrue(resultList.get(random1).contains("Ball"));
        }
    }
}