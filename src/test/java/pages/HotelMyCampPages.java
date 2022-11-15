package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPages {

    public HotelMyCampPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//*[@id='navLogon']/a")
         public WebElement loginMyCampAnasayfa;

         @FindBy(id = "UserName")
         public WebElement hotelMyCampUsername;

         @FindBy(id = "Password")
         public WebElement hotelMyCampPassword;

         @FindBy(id = "btnSubmit")
         public WebElement hotelMyCampLogin;


         @FindBy(className= "hidden-480")
         public WebElement dogrulama;


         @FindBy(id="divMessageResult")
    public WebElement HotelMyCampHataliGiris;
}

