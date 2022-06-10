package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public Select SelectedItem(){
        WebElement currency=driver.findElement(By.name("customerCurrency"));
        Select selectedItem=new Select(currency);
        return selectedItem;
    }

    @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    WebElement facebookLink;

    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    WebElement twitterLink;

    @FindBy(css = "a[href=\"/news/rss/1\"]")
    WebElement newsLink;

    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"]")
    WebElement youtubeLink;

    @FindBy(name = "customerCurrency")
    WebElement currencyList;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    WebElement theFirstSliderWrapper;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    WebElement theSecondSliderWrapper;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span")
    WebElement theComputerPrice;

    @FindBy(xpath = "/html/body/pre")
    WebElement theContext;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2")
    WebElement message;
    //////////////////////////////////////////////////////////////////////////
    public boolean IsFacebookLinkWork(){
        boolean exist = false;
        for (String windowID:driver.getWindowHandles()) {
            String windowURL=driver.switchTo().window(windowID).getCurrentUrl();
            if (windowURL.equals("https://www.facebook.com/nopCommerce")){
                exist=true;
                driver.close();
                break;
            }
        }
        return exist;
    }

    public boolean IsTwitterLinkWork(){
        boolean exist = false;
        for (String windowID:driver.getWindowHandles()) {
            String windowURL=driver.switchTo().window(windowID).getCurrentUrl();
            if (windowURL.equals("https://twitter.com/nopCommerce")){
                exist=true;
                driver.close();
                break;
            }
        }
        return exist;
    }

    public boolean IsNewsLinkWork(){
        boolean exist = false;
        for (String windowID:driver.getWindowHandles()) {
            String windowURL=driver.switchTo().window(windowID).getCurrentUrl();
            if (windowURL.equals("https://demo.nopcommerce.com/news/rss/1")){
                exist=true;
                driver.close();
                break;
            }
        }
        return exist;
    }

    public boolean NewsLink(){
        newsLink.click();
        return theContext.getText().contains("<title>nopCommerce demo store: News</title>");

    }

    public boolean IsYoutubeLinkWork(){
        boolean exist = false;
        for (String windowID:driver.getWindowHandles()) {
            String windowURL=driver.switchTo().window(windowID).getCurrentUrl();
            if (windowURL.equals("https://www.youtube.com/user/nopCommerce")){
                exist=true;
                driver.close();
                break;
            }
        }
        return exist;
    }

    public boolean IsFBLinkWork(){
        boolean exist = false;
        for (String windowID:driver.getWindowHandles()) {
            String windowURL=driver.switchTo().window(windowID).getCurrentUrl();
            if (windowURL.equals("https://www.facebook.com/nopCommerce")){
                exist=true;
                driver.close();
                break;
            }
        }
        return exist;
    }

    /////////////////////////////////////////////////////////////////////////

    public void ConfirmingFacebookLink(){
        facebookLink.click();
      //  driver.close();
    }
    public void ConfirmingTwitterLink(){
        twitterLink.click();
       // driver.close();
    }
    public void ConfirmingNewsLink(){
        newsLink.click();
        driver.navigate().back();
    }
    public void ConfirmingYoutubeLink(){
        youtubeLink.click();
       // driver.close();
    }


    public void ChooseEuroCurrencySteps(){
        Select selectEuro=new Select(currencyList);
        selectEuro.selectByVisibleText("Euro");
    }

    public void ChooseDollarCurrencySteps(){
        Select selectDollar=new Select(currencyList);
        selectDollar.selectByVisibleText("US Dollar");
    }

    public void Verifying1stSliderWrapper(){

        theFirstSliderWrapper.click();
    }
    public void Verifying2ndSliderWrapper(){

        theSecondSliderWrapper.click();
    }

    public boolean Is1stSliderDisplay(){
        return message.getText().contains("Welcome to our store");
    }
    public boolean Is2ndSliderDisplay(){
        return message.getText().contains("Welcome to our store");
    }

    public String GetThePriceContext(){
        return theComputerPrice.getText();
    }
}
