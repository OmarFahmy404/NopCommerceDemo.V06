package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

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

    @FindBy(id = "nivo-slider")
    WebElement sliderWrapper;
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

    public void VerifyingSliderWrapper(){

        sliderWrapper.click();
    }
}
