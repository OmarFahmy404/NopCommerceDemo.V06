package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {
    WebDriver driver;

    public ThankYouPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]")
    WebElement thankYouMessage;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]")
    WebElement urOrderHasBeenSuccessfullyProcessedMessage;

    public String GetThankYouMessage(){
        return thankYouMessage.getText();
    }
    public String GetSecondMessage(){
        return urOrderHasBeenSuccessfullyProcessedMessage.getText();
    }
}
