package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazonpage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonstepDefinitions {


        Amazonpage amazonpage = new Amazonpage();

        @Given("Kullanici amazon anasayfasinda")
        public void kullanici_amazon_anasayfasinda() {
            Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));

        }

        @Then("kullanici amazon sayfasinda Nutella arama yapar")
        public void kullanici_amazon_sayfasinda_nutella_arama_yapar() {

            amazonpage.aramakutusu.sendKeys("Nutella" + Keys.ENTER);
        }

        @Then("sonuclarin Nutella icerdigini test eder")
        public void sonuclarin_nutella_icerdigini_test_eder() {
            String aranankelime = "Nutella";
            String actualkelime = amazonpage.aramasonucElementi.getText();
            Assert.assertTrue(actualkelime.contains(aranankelime));

        }

        @Then("sayfayi kapatir")
        public void sayfayi_kapatir() {
            Driver.closeDriver();

        }

        @Then("kullanici amazon sayfasinda Java arama yapar")
        public void kullanici_amazon_sayfasinda_java_arama_yapar() {
            amazonpage.aramakutusu.sendKeys("Java" + Keys.ENTER);
        }

        @Then("sonuclarin Java icerdigini test eder")
        public void sonuclarin_java_icerdigini_test_eder() {
            String aranankelime = "Java";
            String actualkelime = amazonpage.aramasonucElementi.getText();
            Assert.assertTrue(actualkelime.contains(aranankelime));

        }

        @And("kullanici amazon sayfasinda iphone icin arama yapar")
        public void kullaniciAmazonSayfasindaIphoneIcinAramaYapar() {
            amazonpage.aramakutusu.sendKeys("iphone" + Keys.ENTER);
        }

        @Then("sonuclarin iphone icerdigini test eder")
        public void sonuclarinIphoneIcerdiginiTestEder() {
            String aranankelime = "iphone";
            String actualkelime = amazonpage.aramasonucElementi.getText();
            Assert.assertTrue(actualkelime.contains(aranankelime));

        }

        @Given("kullanici {string} icin arama yapar")
        public void kullanici_icin_arama_yapar(String aranankelime) {
            amazonpage.aramakutusu.sendKeys(aranankelime + Keys.ENTER);

        }

        @Given("sonuclarin {string} icerdiginin testini yapar")
        public void sonuclarin_icerdiginin_testini_yapar(String aranankelime) {

            String expectedKelime = aranankelime;
            String actualKelime = amazonpage.aramasonucElementi.getText();
            Assert.assertTrue(actualKelime.contains(expectedKelime));
        }


        @Given("Kullanici {string} anasayfasinda")
        public void kullanici_anasayfasinda(String istenilenwebsayfasi) {

            Driver.getDriver().get(ConfigurationReader.getProperty(istenilenwebsayfasi));
        }

        @Given("Kullanici Url nin {string} icerdigini test eder")
        public void kullanici_url_nin_icerdigini_test_eder(String istenilenkelime) {
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(actualUrl.contains(istenilenkelime));


        }


        @And("kullanici {int} saniye bekler")
        public void kullaniciSaniyeBekler(int beklemesuresi) {
            try {
                Thread.sleep(beklemesuresi * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

