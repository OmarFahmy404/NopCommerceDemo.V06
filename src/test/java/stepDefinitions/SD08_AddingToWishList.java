package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.WishListPage;

public class SD08_AddingToWishList {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    ProductPage productPage;
    WishListPage wishListPage;

    @Given("the user open browser and navigate to the login page")
    public void OpenAndNavigate(){
        String path=System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
       // loginPage=new LoginPage(driver);

    }
    @And("the user logging in")
    public void LoggingIn(){
        loginPage=new LoginPage(driver);
        loginPage.LoginStep();
    }

    @When("the logged user select an item to add it to wishlist for the first time")
    public void SelectFirstItem(){
        homePage=new HomePage(driver);
        homePage.AddToWishList();
       /* productPage=new ProductPage(driver);
        productPage.FirstAddingSteps();*/
    }

  /*  @And("the logged user go back and select anther one")
    public void SelectSecondItem(){
        homePage=new HomePage(driver);
        homePage.AddToWishList();
    }*/

    @Then("the item added successfully to wishlist")
    public void CheckingTheWishlist(){
        wishListPage=new WishListPage(driver);
        SoftAssert soft= new SoftAssert();
        soft.assertEquals("(2,8)",wishListPage.GetInfoFromTable());

    }
    @And("close the browser")
    public void CloseBrowser(){
        driver.quit();
    }

}
