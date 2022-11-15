package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Yourlogopage {

    public Yourlogopage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


        @FindBy (xpath = "//a[@class='login']")
        public WebElement Singin;

        @FindBy (id = "email_create")
         public WebElement emailalani;

       @FindBy (id = "SubmitCreate")
        public WebElement hesapolustur;

         @FindBy (id = "uniform-id_gender1")
         public WebElement title;
}
