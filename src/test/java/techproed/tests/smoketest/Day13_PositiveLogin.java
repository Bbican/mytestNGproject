package techproed.tests.smoketest;

import org.testng.annotations.Test;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

public class Day13_PositiveLogin {
    /*
        Testing important functionalities of the application
       1. To check if the application up and running
       2. To check if critical functionalities are working
      In a smoke test:
      -login
      -log out
      -create account
      -add to card
      -make payment
      --------
      There are 21 test scripts in my smoke
      Smoke test automation script should take abaut 15-20 minute an avrage.
      -------
      Who chooses to include functionalities in the smoke suit.
      -Test Leads(Senior testers who knows the application very good), chooses what goes to smoke tyest suit.
      ----------
      Regression test:
      1. Testing ALL major functionalities of the application
      - All smoke tests +
      - Loan creation +
      - account creation, edit, delete,....
      - search
      -... many more
      - There are 600 Test scripts
      - 8-10 hours
      -----------------------------
      When do you do regression testing?
      1. Before every release.(minor(every 3 months) or major release(Every 6 months))
      2. After each major buy fix. To make sure there is no impact on the existing functionalities
      ------------------------------
      Unit test < integration test(testing if components are working good together) < regression test

     */

    LoginPage loginPage = new LoginPage();
    @Test
    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        loginPage.loginDropdown.click();
        loginPage.signInButton.click();
        loginPage.username.sendKeys(ConfigurationReader.getProperty("employee_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("employee_passsword"));
        loginPage.loginButton.click();

    }
}
