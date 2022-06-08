package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CompareProductPage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class SD11_AddingItemsToCompareList {
    LoginPage loginPage;
    HomePage homePage;
    CompareProductPage compareProductPage;

  /*  @Given("the user open browser and navigate to the login page to compare items")
    public void OpenAndNavigate(){
        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("the user logged in to compare between two items")
    public void LoggingIn(){
        loginPage=new LoginPage(driver);
        loginPage.LoginStep();
    }*/

    @When("the logged user select two items to add them to compare list")
    public void SelectItems(){
        loginPage=new LoginPage(Hooks.driver);
        loginPage.LoginStep();
        homePage=new HomePage(Hooks.driver);
        homePage.ComparisonProcessSteps();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Then("the two items added successfully to compare list page")
    public void CheckingOfProcess(){

        Assert.assertTrue(homePage.GetMessage().contains("The product has been added to your "));
//         Assert.assertEquals("(5,5)",homePage.GetDimensionOfCompareTable());
        Assert.assertTrue(homePage.ClearListBtnInComparePageIsDisplayed());
    }
   /* @And("quiting")
    public void Quiting(){
        driver.quit();
    }*/
}
