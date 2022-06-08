package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.MainPage;

public class SD03_SwitchingBetweenCurrency {
    MainPage mainPage;
    @When("the user choose a Euro currency")
    public void ChoosingEuro(){
        mainPage=new MainPage(Hooks.driver);
        mainPage.ChooseEuroCurrencySteps();
    }
    @And("switch it to Dollar currency")
    public void SwitchingToDollar(){
        mainPage.ChooseDollarCurrencySteps();
    }
    @Then("the currency switched from Euro to Dollar")
    public void CheckingTheActiveCurrency(){
        Assert.assertEquals("US Dollar",mainPage.SelectedItem().getFirstSelectedOption().getText());
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
