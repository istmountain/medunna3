package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HerokuappPage;

import java.util.List;

public class Herokuapp {

     HerokuappPage herokuappPage=new HerokuappPage();

    @Then("AddRemoveElement butonuna tiklar")
    public void addremove_element_butonuna_tiklar() {
       herokuappPage.addRemoveElement.click();
    }

    @And("AddElement butonunu tiklar")
    public void addelementButonunuTiklar() {
        herokuappPage.addElementbutonu.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {


    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.Deletebutonu.getText().contains("Delete"));

    }
    @Then("Delete butonuna basarak butonu silin")
    public void delete_butonuna_basarak_butonu_silin() {
      herokuappPage.Deletebutonu.click();
    }
    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {

       int sayac=0;
        List<WebElement> arananElement =herokuappPage.body;
        System.out.println(arananElement.size());
        for (WebElement each:arananElement
             ) { if(each.getText().contains("Delete"))
                 sayac++;
            System.out.println(sayac);
        }
        Assert.assertTrue(sayac==0);

    }

    }

