package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HotelMyCamp {

         HotelMyCampPages hotelMyCamp=new HotelMyCampPages();



           @Then("login yazisina tiklar")
           public void login_yazisina_tiklar() {
          hotelMyCamp.loginMyCampAnasayfa.click();

    }

    @Then("Gecerli username girer")
    public void gecerli_username_girer() {
      hotelMyCamp.hotelMyCampUsername.sendKeys(ConfigurationReader.getProperty("hotelValidUsername"));

    }
    @Then("Gecerli password girer")
    public void gecerli_password_girer() {
    hotelMyCamp.hotelMyCampPassword.sendKeys(ConfigurationReader.getProperty("hotelValidPassword"));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
    hotelMyCamp.hotelMyCampLogin.click();
    }
    @Then("Sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {

         String expectedisim= "ADD USER";
         String actualisim=hotelMyCamp.dogrulama.getText();
         Assert.assertTrue(actualisim.contains(expectedisim));
    }


    @And("Gecerli  {string} girer")
    public void gecerliGirer(String GecerliUsername) {
   hotelMyCamp.hotelMyCampUsername.sendKeys(ConfigurationReader.getProperty(GecerliUsername));

    }


    @And("Gecerli {string} girerr")
    public void gecerliGirerr(String GecerliPassword) {
        hotelMyCamp.hotelMyCampPassword.sendKeys(ConfigurationReader.getProperty(GecerliPassword));
           }

    @And("Gecersiz bir username girilir")
    public void gecersizBirUsernameGirilir() {
       hotelMyCamp.hotelMyCampUsername.sendKeys(ConfigurationReader.getProperty("hotelInvalidusername"));

     }

    @And("Gecersiz password girilir")
    public void gecersizPasswordGirilir() {

    hotelMyCamp.hotelMyCampPassword.sendKeys(ConfigurationReader.getProperty("hotelInvalidPassword"));
    }

    @And("Sayfaya giris yapilamadigi test edilir")
    public void sayfayaGirisYapilamadigiTestEdilir() {
      String expectedihatamesaji="Try again please";
      String actualhatamesaji=hotelMyCamp.HotelMyCampHataliGiris.getText();
      Assert.assertTrue(actualhatamesaji.contains(expectedihatamesaji));

    }


    @And("kullanici yanlis username {string} girer")
    public void kullaniciYanlisUsernameGirer(String girilenUsername) {
        hotelMyCamp.hotelMyCampUsername.sendKeys(girilenUsername);

    }

    @And("kullanici yanlis password {string} girer")
    public void kullaniciYanlisPasswordGirer(String girilenPassword) {
        hotelMyCamp.hotelMyCampPassword.sendKeys(girilenPassword);
    }
}
