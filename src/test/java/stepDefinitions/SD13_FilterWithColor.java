package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ShoesPage;

import java.time.Duration;

public class SD13_FilterWithColor {
    LoginPage loginPage;
    ShoesPage shoesPage;
    HomePage homePage;

   /* @Given("user open and navigate to login page")
    public void OpenAndNavigate(){
        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user logged in")
    public void logginIn(){
        loginPage=new LoginPage(driver);
        loginPage.LoginStep();
    }*/

    @When("the user select a color and unselect it")
    public void SelectAndUnSelectColor(){
        loginPage=new LoginPage(Hooks.driver);
        loginPage.LoginStep();
        homePage=new HomePage(Hooks.driver);
        homePage.OpenShoesPage();
        shoesPage=new ShoesPage(Hooks.driver);
        shoesPage.SelectAndUnSelectColor();
    }

    @And("the user select a new color")
    public void SelectNewColor(){
        shoesPage.SelectNewColor();
    }

    @Then("the filter work as expected")
    public void CheckingColors(){
        Assert.assertTrue(shoesPage.IsRedShoesDisplay());
        Assert.assertFalse(shoesPage.IsGraySelected());
    }
   /* @And("close")
    public void Close(){
        driver.quit();
    }*/
}
