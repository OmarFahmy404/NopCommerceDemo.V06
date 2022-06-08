package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage {
    WebDriver driver;

    public PasswordRecoveryPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "email")
    WebElement emailField;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
    WebElement sendBtn;

    @FindBy(xpath = "/html/body/div[5]/div/p")
    WebElement message;

    public void RecoveryProcess(){
        emailField.sendKeys("test4@n.com");
        sendBtn.click();
    }
    public String GetMessage(){
        return message.getText();
    }
}
