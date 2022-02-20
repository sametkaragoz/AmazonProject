package ui.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_002StepDefination {
    @When("Sag ustteki 'Hello, Sign in' butonuna basar.")
    public void sag_ustteki_butonuna_basar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("Acilan sayfadaki ilgili kutucuga gecerli e-mail ya da telefon numarasini girer. Continue butonuna basar.")
    public void acilanSayfadakiIlgiliKutucugaGecerliEMailYaDaTelefonNumarasiniGirerContinueButonunaBasar() {

    }

    @And("Acilan sayfadaki ilgili kutucuga gecerli passwordu girer. Sign-in butonuna basar.")
    public void acilanSayfadakiIlgiliKutucugaGecerliPassworduGirerSignInButonunaBasar() {
    }

    @Then("Acilan sayfada 'Hello 'username'' yazdigi dogrulanir.")
    public void acilanSayfadaHelloUsernameYazdigiDogrulanir() {
    }

    @And("Acilan sayfadaki ilgili kutucuga gecersiz e-mail ya da telefon numarasini girer. Continue butonuna basar.")
    public void acilanSayfadakiIlgiliKutucugaGecersizEMailYaDaTelefonNumarasiniGirerContinueButonunaBasar() {
    }

    @And("Gecersiz e-mail ya da telefon numarasi hata mesaji alindigi kontrol edilir.")
    public void gecersizEMailYaDaTelefonNumarasiHataMesajiAlindigiKontrolEdilir() {
    }

    @And("Kullanici gecerli e-mail ya da telefon numarasini girer. Continue butonuna basar.")
    public void kullaniciGecerliEMailYaDaTelefonNumarasiniGirerContinueButonunaBasar() {
    }

    @And("Acilan sayfadaki ilgili kutucuga gecersiz passwordu girer. Sign-In butonuna basar.")
    public void acilanSayfadakiIlgiliKutucugaGecersizPassworduGirerSignInButonunaBasar() {
    }

    @Then("Gecersiz password hata mesaji alindigi kontrol edilir.")
    public void gecersizPasswordHataMesajiAlindigiKontrolEdilir() {
    }
}
