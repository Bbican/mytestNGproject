package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.security.PublicKey;

public class RegistrationPage {
    public RegistrationPage(){
        // to instantiate the page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // WebElement ssn = findElement(By.id("ssn"));
    // @FindBy(id ="ssn")
    // public WebElement ssn;
    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(name = "firstname")
    public WebElement firstname;

    @FindBy(name = "lastname")
    public WebElement lastname;

    @FindBy(name = "address")
    public  WebElement address;

    @FindBy(name = "mobilephone")
    public WebElement mobilephone;

    @FindBy(name = "username")
    public  WebElement username;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "firstPassword")
    public  WebElement firstPassword;

    @FindBy(name = "secondPassword")
    public WebElement secondPassword;

    @FindBy(id = "register-submit")
    public  WebElement register_submit;


}
