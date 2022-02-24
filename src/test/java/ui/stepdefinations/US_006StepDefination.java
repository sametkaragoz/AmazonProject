package ui.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import ui.pages.Locators;
import ui.utilities.Driver;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class US_006StepDefination {

    Locators locators = new Locators();
    Random random = new Random();
    List<String> priceList = new ArrayList<>();
    List <String> lastPriceList = new ArrayList<>();

    @And("Listeden aranan urun secilir ve tiklanir.")
    public void listeden_aranan_urun_secilir_ve_tiklanir() {
        int random1 = random.nextInt(locators.searcResultDescriptionsList.size());
        locators.searcResultDescriptionsList.get(random1).click();
        priceList.clear();
    }

    @Then("Urun sayfasinda 'Add to Cart' butonuna basilarak urun sepete eklenir.")
    public void urunSayfasindaButonunaBasilarakUrunSepeteEklenir() throws InterruptedException {
        locators.addToCartButton.click();

        locators.searcResultDescriptionsList.clear();
        Driver.wait(1);
        Driver.getDriver().navigate().back();
        locators.searchBox.clear();
        locators.searchBox.sendKeys("tree" + Keys.ENTER);
        int random1 = random.nextInt(locators.searcResultDescriptionsList.size());
        locators.searcResultDescriptionsList.get(random1).click();
        locators.addToCartButton.click();
        Driver.wait(2);
        Driver.getDriver().navigate().back();
    }


    @Then("Tum urunlerin toplam fiyatinin sepetteki ara toplama esit oldugu test edilir.")
    public void tumUrunlerinToplamFiyatininSepettekiAraToplamaEsitOlduguTestEdilir() {
        locators.cartIcon.click();
        int count = Integer.parseInt(locators.cartItemCount.getText());
        for (int i=0 ; i<count ; i++) {
            priceList.add(locators.itemCountPriceList.get(i).getText());
        }
        for (int i=0 ; i<count ; i++) {
            String str1=priceList.get(i).replace("$", "");
            lastPriceList.add(str1);
            System.out.println("+");
        }

        double toplam=0;

        for (int i = 0 ; i<count; i++) {
            Double sayi1 = Double.parseDouble(lastPriceList.get(i));
             toplam+=sayi1;
        }
        System.out.println(priceList);
        System.out.println(lastPriceList);
        System.out.println(toplam);
        System.out.println("---------------------");
        String str2 = locators.subTotalText.getText().replace("$", "");
        System.out.println(str2);
        DecimalFormat df = new DecimalFormat("###.##");
        Double dblToplam = Double.valueOf(df.format(toplam));
        Double dblStr2 = Double.valueOf(str2);
        System.out.println(dblToplam);
        Assert.assertEquals(dblToplam, dblStr2);

    }
}