package techproed.tests.smoketest;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.RegistrationPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

public class Day15_RegistrationTest {
    RegistrationPage registrationPage;
    @Test
    public void registrationTest(){
     //   Driver.getDriver().get("https://www.gmibank.com/account/register");
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_registration_url"));
        registrationPage = new RegistrationPage();
    //    Driver.getDriver().findElement(By.id("ssn")).sendKeys("111111111");
        registrationPage.ssn.sendKeys("111111111");
    // complete the test of the test case
    //Enter all fields and clik register
    // Create page objects in the page class
    // Then use it in the test class
    // DO MANUAL TESTING FIRST
      //  registrationPage

        registrationPage.firstname.sendKeys("Recep Tayyip ");
        registrationPage.lastname.sendKeys("Erdogan");
        registrationPage.address.sendKeys("Istanbul Uskudar");
        registrationPage.mobilephone.sendKeys("1666666666");
        registrationPage.username.sendKeys("TIRAN");
        registrationPage.email.sendKeys("tiran@tc.com");
        registrationPage.firstPassword.sendKeys("Recep_Tayyip");
        registrationPage.secondPassword.sendKeys("Recep_Tayyip");
        registrationPage.register_submit.click();


    }
    @AfterMethod
    public  void tearDown() {
        Driver.closeDriver();
    }
}
