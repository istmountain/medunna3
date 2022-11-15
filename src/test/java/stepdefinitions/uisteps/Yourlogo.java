package stepdefinitions.uisteps;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Yourlogopage;
import utilities.Driver;

public class Yourlogo {
      Yourlogopage yourlogo=new Yourlogopage();
      JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
      Actions actions=new Actions(Driver.getDriver());
      Faker faker = new Faker();

    @Given("kullanici Sing in linkine tiklar")
    public void kullanici_sing_in_linkine_tiklar() {

    yourlogo.Singin.click();
    yourlogo.Singin.click();

    }


    @And("kullanici Create an Account bolumune email adresi girer")
    public void kullaniciCreateAnAccountBolumuneEmailAdresiGirer() {
      js.executeScript("arguments[0].click()",yourlogo.emailalani);
     yourlogo.emailalani.sendKeys(faker.internet().emailAddress());

    }



    @Given("Create an account bolumunu tiklar")
    public void create_an_account_bolumunu_tiklar() {

    yourlogo.hesapolustur.click();


    }

    @Given("Kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullanici_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() throws InterruptedException {
    actions.click(yourlogo.title);
    Thread.sleep(3000);
    actions.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.name().
    lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.internet().password()).sendKeys(Keys.TAB)
    .sendKeys("1").sendKeys(Keys.TAB).sendKeys("July").sendKeys(Keys.TAB).sendKeys("1975").sendKeys(Keys.TAB).
    sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).

    sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(faker.address().city()).sendKeys(Keys.TAB).
    sendKeys("Alabama").sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB).
    sendKeys("34000")
        .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("bla...bla...bla").
    sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).sendKeys(faker.address().secondaryAddress())
    .sendKeys(Keys.ENTER).perform();






    }

    @Given("kullanici register butonunu tiklar")
    public void kullanici_register_butonunu_tiklar() {

    }

    @Given("Kullanici hesap olustugunu dogrular")
    public void kullanici_hesap_olustugunu_dogrular() {

    }



}
