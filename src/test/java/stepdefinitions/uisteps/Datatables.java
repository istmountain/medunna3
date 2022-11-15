package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.DatatablesPage;

public class Datatables {
     DatatablesPage datatablesPage=new DatatablesPage();

    @Then("new butonuna tiklar")
    public void new_butonuna_tiklar() {
     datatablesPage.newTusu.click();
    }

    @Then("isim bolumune {string} girer")
    public void isim_bolumune_girer(String isim) {
    datatablesPage.isim.sendKeys(isim);
    }

    @Then("soyisim bolumune {string} girer")
    public void soyisim_bolumune_girer(String soyisim) {
    datatablesPage.soyisim.sendKeys(soyisim);
    }

    @Then("pozisyon bolumune {string} girer")
    public void pozisyon_bolumune_girer(String pozisyon) {
   datatablesPage.pozisyon.sendKeys(pozisyon);
    }

    @Then("office bolumune sehir {string} adi girer")
    public void office_bolumune_sehir_adi_girer(String office) {
    datatablesPage.ofis.sendKeys(office);
    }

    @Then("Extension bolumune {string} adi girilir")
    public void extension_bolumune_adi_girilir(String extension) {
     datatablesPage.extension.sendKeys(extension);
    }

    @Then("startdate bolumune {string} girilir")
    public void startdate_bolumune_girilir(String startdate) {
   datatablesPage.startdate.sendKeys(startdate);
    }

    @Then("salary bolumune {string} girilir")
    public void salary_bolumune_girilir(String maas) {
   datatablesPage.maas.sendKeys(maas);
    }

    @Then("create butonuna tiklar")
    public void create_butonuna_tiklar() {
   datatablesPage.create.click();
    }



    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String isim) {

    datatablesPage.search.sendKeys(isim);

    }

    @And("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(datatablesPage.dogrulama.getText().contains(isim));

    }


}

