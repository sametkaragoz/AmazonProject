package ui.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import ui.pages.Locators;
import ui.utilities.Driver;

public class US_005StepDefination {

    Locators locators = new Locators();
    Select options = new Select(locators.sortBySelectObject);

    @And("Acilan sayfanin solundaki filtreleme kategorilerinden secim yaparak arama filtrelenebilmeli.")
    public void acilan_sayfanin_solundaki_filtreleme_kategorilerinden_secim_yaparak_arama_filtrelenebilmeli() {
        locators.toysAndGamesFilterButton.click();
        locators.babyToysFilterButton.click();
    }

    @Then("Acilan sayfanin sag ustunde siralama gorevi goren Sort by: butonuna basilarak dort turde siralama yapilabilmeli.")
    public void acilanSayfaninSagUstundeSiralamaGoreviGorenSortByButonunaBasilarakDortTurdeSiralamaYapilabilmeli() throws InterruptedException {
        options.selectByVisibleText("Price: Low to High");
        Driver.wait(1);
        options.selectByVisibleText("Price: High to Low");
    }
}
