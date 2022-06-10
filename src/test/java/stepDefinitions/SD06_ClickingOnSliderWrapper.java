package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

import java.time.Duration;

public class SD06_ClickingOnSliderWrapper {
    MainPage mainPage;

    @When("the guest click on the first wrapper slider")
    public void ClickingOn1stSlider(){
        mainPage=new MainPage(Hooks.driver);
        mainPage.Verifying1stSliderWrapper();
    }

    @When("the guest click on the second wrapper slider")
    public void ClickingOn2ndSlider(){
        mainPage=new MainPage(Hooks.driver);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        mainPage.Verifying2ndSliderWrapper();
    }

    @Then("the welcome message will appear after click on the 1st one")
    public void Verifying1st(){
        Assert.assertEquals("https://demo.nopcommerce.com/",Hooks.driver.getCurrentUrl());
        Assert.assertTrue(mainPage.Is1stSliderDisplay());
    }

    @Then("the welcome message will appear after click on the 2nd one")
    public void Verifying2nd(){
        Assert.assertEquals("https://demo.nopcommerce.com/",Hooks.driver.getCurrentUrl());
        Assert.assertTrue(mainPage.Is2ndSliderDisplay());
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
