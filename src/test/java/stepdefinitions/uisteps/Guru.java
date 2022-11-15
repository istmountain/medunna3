package stepdefinitions.uisteps;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Gurupages;
import utilities.Driver;

import java.util.List;

public class Guru {

    Gurupages gurupages=new Gurupages();

              @And("Cerezleri kabul eder")
           public void cerezleriKabulEder() {

           Driver.getDriver().switchTo().frame(gurupages.iframe);
            gurupages.cerez.click();


              }

    @And("{string} degerlerinin tumunu yazdirir")
    public void degerlerininTumunuYazdirir(String istenenbaslik)  {

        List<WebElement> basliklistesilist = gurupages.basliklistesi ;

        for (WebElement each:basliklistesilist

        ) {
            System.out.println(each.getText());

        }


        int istenenBaslikIndexi=-3;
        for (int i = 0; i < basliklistesilist.size(); i++) {
            if (basliklistesilist.get(i).getText().contains(istenenbaslik)){
                istenenBaslikIndexi=i+1;

                System.out.println(istenenBaslikIndexi);
                break;
            }
        }

        if (istenenBaslikIndexi != -3){ // baslik bulundu
            List<WebElement> istenenSutundakiElementler=
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement each:istenenSutundakiElementler
            ) {
                System.out.println(each.getText());
            }


        } else{  //baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }


        }

    }












