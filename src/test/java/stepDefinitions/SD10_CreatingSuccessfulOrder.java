package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.*;

public class SD10_CreatingSuccessfulOrder {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    CheckOutPage checkOutPage;
    ThankYouPage thankYouPage;
    ShoppingCartPage shoppingCartPage;


    @Given("the user opened browser and navigates to the login page to add an item")
    public void OpenAndNavigateToLoginPage(){
        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("the user logged in")
    public void LoggingIn(){
        loginPage=new LoginPage(driver);
        loginPage.LoginStep();
    }

    @And("after searching the logged user selected an item and put it in his shopping cart")
    public void SelectedProduct(){
        homePage=new HomePage(driver);
        homePage.AddingToShoppingCart();
    }

    @When("he completes his payment method")
    public void CompletionPaymentMethod(){
        homePage=new HomePage(driver);
        homePage.ClickOnShoppingCartTab();
       shoppingCartPage=new ShoppingCartPage(driver);
       shoppingCartPage.FinishingCheckProcess();
        checkOutPage=new CheckOutPage(driver);
        checkOutPage.FillingBillingFields();

    }

    @Then("the payment method of order has done")
    public void DidProcessFinishSuccessfully(){
        thankYouPage=new ThankYouPage(driver);
       // Assert.assertEquals("Thank you",thankYouPage.GetThankYouMessage());
        Assert.assertEquals("Your order has been successfully processed!",thankYouPage.GetSecondMessage());

    }
    @And("close the final page of browser")
    public void Close(){
        driver.quit();
    }























}
