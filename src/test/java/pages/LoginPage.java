package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[class=\"ico-login\"]")
    WebElement loginPage;

    @FindBy(id="Email")
    WebElement emailField;

    @FindBy(id="Password")
    WebElement passwordField;

    @FindBy(css="button[class=\"button-1 login-button\"]")
    WebElement loginBtn;
    public void d(){
        loginPage.click();


    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a")
    WebElement forgetPasswordLink;

    public void LoginStep(){
        loginPage.click();
        emailField.sendKeys("5@5.com");
        passwordField.sendKeys("123456");
        loginBtn.click();
    }

    public void ForgetPassword(){
        loginPage.click();
        forgetPasswordLink.click();
    }
}
