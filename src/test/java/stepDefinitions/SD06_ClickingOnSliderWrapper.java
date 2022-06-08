package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.MainPage;

public class SD06_ClickingOnSliderWrapper {
    MainPage mainPage;

    @When("the guest click on the wrapper slider")
    public void ClickingOnSlider(){
        mainPage=new MainPage(Hooks.driver);
        mainPage.VerifyingSliderWrapper();
    }
    @Then("the page will refresh")
    public void Verifying(){
        Assert.assertEquals("https://demo.nopcommerce.com/",Hooks.driver.getCurrentUrl());
    }

//    @Before
//    public void OpenBrowserAndNavigate(){
//        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",path);
//
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to("https://demo.nopcommerce.com/");
//        mainPage=new MainPage(driver);
//    }
//
//    @After
//    public void CloseBrowser(){
//        driver.quit();
//    }
}
