package ui.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import ui.pages.Locators;
import ui.utilities.Driver;

import java.util.Random;

public class US_009StepDefination {

    Locators locators = new Locators();
    Random random = new Random();
    Actions actions = new Actions(Driver.getDriver());

    @And("Istenilen urune tiklanir ve Add to List butonundan secerek istenilen listeye eklenir.")
    public void istenilen_urune_tiklanir_ve_add_to_list_butonundan_secerek_istenilen_listeye_eklenir() throws InterruptedException {
        locators.searcResultDescriptionsList.clear();
        int random1 = random.nextInt(locators.searcResultDescriptionsList.size());
        locators.searcResultDescriptionsList.get(random1).click();
        locators.wishlistOptionsButton.click();
        Driver.wait(1);
        locators.wishListSecondOption.click();
        Driver.wait(1);
    }

    @Then("Listede eklenen urunun varligi kontrol edilir.")
    public void listedeEklenenUrununVarligiKontrolEdilir() {
        Assert.assertTrue(locators.addedListAssert.isDisplayed());
    }

    @And("Accounts & Lists sekmesinden urun silinmesi istenilen listeye tiklar.")
    public void accountsListsSekmesindenUrunSilinmesiIstenilenListeyeTiklar() {
        actions.moveToElement(locators.accountAndListsButton).perform();
        locators.sametYeniListeButton.click();
    }

    @Then("Silmek istedigi urune ait Delete butonuna basar. Ilgili satirda Deleted yazisinin goruldugu test edilir.")
    public void silmekIstedigiUruneAitDeleteButonunaBasarIlgiliSatirdaDeletedYazisininGorulduguTestEdilir() {
        locators.deleteItemButton.click();
        Assert.assertTrue(locators.deletedAlert.isDisplayed());

    }
}
