package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class SD04_HoverAndSelectedCategories {
    WebDriver driver;
    HomePage homePage;
    @When("the user hover on the category")
    public void Hovering(){
        homePage.HoverSteps();
    }
    @And("select the first category")
    public void Selecting(){
        homePage.SelectCategories();
    }
    @Then("the last category is a final category")
    public void Checking(){
        Assert.assertEquals("https://demo.nopcommerce.com/digital-downloads",driver.getCurrentUrl());
    }
//    @Before
//    public void OpenBrowserAndNavigate(){
//        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",path);
//
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to("https://demo.nopcommerce.com/");
//        homePage=new HomePage(driver);
//
//        LoginPage loginPage=new LoginPage(driver);
//        loginPage.LoginStep();
//    }
//
//    @After
//    public void CloseBrowser(){
//        driver.quit();
//    }
}
