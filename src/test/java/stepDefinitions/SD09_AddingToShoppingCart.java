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
import pages.ShoppingCartPage;

import java.time.Duration;

public class SD09_AddingToShoppingCart {
    HomePage homePage;
    ShoppingCartPage shoppingCartPage;
    LoginPage loginPage;

   /* @Given("the user open browser and navigate to the login page to add an item")
    public void OpenAndNavigate(){
        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        // loginPage=new LoginPage(driver);

    }
    @And("the user logging in to add an item")
    public void LoggingIn(){
        loginPage=new LoginPage(driver);
        loginPage.LoginStep();
    }*/

    @When("the logged user select an item to add it to shopping cart")
    public void AddingItemToShoppingCart(){
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage=new LoginPage(Hooks.driver);
        loginPage.LoginStep();
        homePage=new HomePage(Hooks.driver);
        homePage.AddingToShoppingCart();

    }

    @Then("the item added successfully to shopping cart")
    public void CheckingTheShoppingCart(){
        homePage=new HomePage(Hooks.driver);
        homePage.ClickOnShoppingCartTab();
        shoppingCartPage=new ShoppingCartPage(Hooks.driver);
        Assert.assertEquals("AP_MBP_13",shoppingCartPage.GetItemName());

    }


   /* @And("close the browser after adding the item")
    public void Close(){
        driver.quit();
    }*/
}
