package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;

public class SD02_LoginPageStepDef {
    WebDriver driver;
    LoginPage loginPage;

    @When("the user enter his valid email and password")
    public void ValidData(){
        loginPage.LoginStep();

    }

    @Then("the user could be able to login his page")
    public void SuccessLogin(){
        Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
    }

//    @Before
//    public void OpenBrowserAndNavigate(){
//        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",path);
//
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to("https://demo.nopcommerce.com/");
//        loginPage=new LoginPage(driver);
//    }
//
//    @After
//    public void CloseBrowser(){
//        driver.quit();
//    }
}
