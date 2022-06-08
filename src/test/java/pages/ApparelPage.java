package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelPage {
    WebDriver driver;
    public ApparelPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/ul/li[1]/a")
    WebElement shoes;
    public void OpenShoesCategory(){
        shoes.click();
    }
}
