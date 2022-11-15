package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuappPage {
    public HerokuappPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
        @FindBy(xpath = "//a[.='Add/Remove Elements']")
        public WebElement addRemoveElement;

        @FindBy(xpath = "//button[@onclick='addElement()']")
        public WebElement addElementbutonu;

        @FindBy(xpath = "//button[.='Delete']")
        public WebElement Deletebutonu;

        @FindBy(id = "content")
        public List<WebElement> body;




}
