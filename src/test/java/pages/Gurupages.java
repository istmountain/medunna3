package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Gurupages {

    public Gurupages() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

         @FindBy(xpath = "//*/table/tbody/tr/td[1]")
         public List<WebElement> guruTable1sutun;

        @FindBy(xpath = "//thead//tr//th")
         public List<WebElement> basliklistesi;


         @FindBy( id= "gdpr-consent-notice")
         public WebElement iframe;

         @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[4]")
         public WebElement cerez;


}
