package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class SD05_SearchingForAnyProduct {
    WebDriver driver;
    HomePage homePage;

    @When("^the logged user enter \"(.*)\" and click on search button$")
    public void SearchingByName(String s){
        homePage.SearchingForProduct(s);
    }
    @Then("the logged user redirected to the searched product page SKU")
    public void CheckinSKU(){
        Assert.assertEquals("https://demo.nopcommerce.com/search?q=Apple+MacBook+Pro+13-inch",driver.getCurrentUrl());
    }

    @Then("the logged user redirected to the searched product page")
    public void CheckinProductName(){
        Assert.assertEquals("https://demo.nopcommerce.com/search?q=Apple+MacBook+Pro+13-inch",driver.getCurrentUrl());
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
