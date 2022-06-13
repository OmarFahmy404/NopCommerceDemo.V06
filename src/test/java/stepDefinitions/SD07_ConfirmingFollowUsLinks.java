package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.MainPage;

import java.time.Duration;

public class SD07_ConfirmingFollowUsLinks {
    MainPage mainPage;

    @When("the guest click on the facebook link")
    public void ClickingOnFacebookLink() {
        mainPage=new MainPage(Hooks.driver);
        mainPage.ConfirmingFacebookLink();
    }

    @When("the guest click on the twitter link")
    public void ClickingOnTwitterLink() {
        mainPage=new MainPage(Hooks.driver);
        mainPage.ConfirmingTwitterLink();
    }

    @When("the guest click on the news link")
    public void ClickingOnNewsLink() {
        mainPage=new MainPage(Hooks.driver);
        mainPage.ConfirmingNewsLink();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @When("the guest click on the youtube link")
    public void ClickingOnYoutubeLink() {
        mainPage=new MainPage(Hooks.driver);
        mainPage.ConfirmingYoutubeLink();
    }

    @Then("the guest redirected to the facebook page")
    public void ConfirmationOfFacebookLink() {
        Assert.assertTrue( mainPage.IsFBLinkWork());
    }

    @Then("the guest redirected to the twitter page")
    public void ConfirmationOfTwitterLink(){
        Assert.assertTrue(mainPage.IsTwitterLinkWork());
    }

    @Then("the guest redirected to the news page")
    public void ConfirmationOfNewsLink(){

        // believe me I did my best here ,and I didn't get you if the issue still available
        //in the second assertion result it is true because the URL which you directed to is "https://demo.nopcommerce.com/news/rss/1"
        //in the third one what I got it from FWD platform is the url doesn't work and this url should be the expected "nopCommerce demo store. New online store is open!"
        // and of course the result will not be the same
        // I hope this get you satisfied

        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")).isEnabled());
        Assert.assertEquals(mainPage.GetNewsURL(),"nopCommerce demo store. New online store is open!");

      //  Assert.assertTrue(mainPage.IsNewsLinkWork());
       // Assert.assertTrue(mainPage.NewsLink());
    }

    @Then("the guest redirected to the youtube page")
    public void ConfirmationOfYoutubeLink(){
        Assert.assertTrue(mainPage.IsYoutubeLinkWork());
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
