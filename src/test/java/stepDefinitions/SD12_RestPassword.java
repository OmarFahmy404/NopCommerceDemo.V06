package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.PasswordRecoveryPage;

import java.time.Duration;

public class SD12_RestPassword {
    LoginPage loginPage;
    PasswordRecoveryPage passwordRecoveryPage;

   /* @Given("the user open and navigate to the login page")
    public void  Navigate(){
        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");

    }*/

    @When("the user reset his password through reset password link")
    public void ClickOnResetPasswordLink(){
        loginPage=new LoginPage(Hooks.driver);
        loginPage.ForgetPassword();
    }
    @And("he enter his valid email")
    public void EnterEmail(){
        passwordRecoveryPage=new PasswordRecoveryPage(Hooks.driver);
        passwordRecoveryPage.RecoveryProcess();

    }

    @Then("the password reset successfully")
    public void Checking(){
        Assert.assertEquals("Email with instructions has been sent to you.",passwordRecoveryPage.GetMessage());
    }
   /* @And("Quit")
    public void Quit(){
        driver.quit();
    }*/



}
