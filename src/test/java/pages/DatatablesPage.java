package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatatablesPage {
    public DatatablesPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
       @FindBy(xpath = "//span[text()='New']")
    public WebElement newTusu;

      @FindBy(id = "DTE_Field_first_name")
    public WebElement isim;

       @FindBy(id = "DTE_Field_last_name")
    public WebElement soyisim;
        @FindBy(id = "DTE_Field_position")
    public WebElement pozisyon;
        @FindBy(id = "DTE_Field_office")
    public WebElement ofis;
        @FindBy(id = "DTE_Field_extn")
    public WebElement extension ;

        @FindBy(id ="DTE_Field_start_date" )
    public WebElement startdate;
        @FindBy(id = "DTE_Field_salary")
    public WebElement maas;

        @FindBy(className = "DTE_Form_Buttons")
      public WebElement create;


         @FindBy(xpath = "//input[@type='search']")
    public WebElement search;

         @FindBy(className = "sorting_1")
       public WebElement dogrulama;
}
