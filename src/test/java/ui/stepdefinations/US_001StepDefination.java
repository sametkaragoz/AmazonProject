package ui.stepdefinations;

import io.cucumber.java.en.When;
import ui.utilities.ConfigurationReader;
import ui.utilities.Driver;

public class US_001StepDefination {

    @When("Kullanici www.amazon.com sayfasina gider.")
    public void kullanici_www_amazon_com_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
    }
}