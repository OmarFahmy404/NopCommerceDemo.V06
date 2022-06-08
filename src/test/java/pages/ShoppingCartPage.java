package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "table[class=\"cart\"]")
    WebElement shoppingCartTable;

    @FindBy(id = "termsofservice")
    WebElement TermsCheckListBtn;

    @FindBy(id = "checkout")
    WebElement checkOutBtn;



    public String GetItemName(){
        String productName=null;
        List<WebElement> rows=shoppingCartTable.findElements(By.tagName("tr"));
        for(WebElement row:rows){
            List<WebElement> clos=shoppingCartTable.findElements(By.tagName("td"));
            for (WebElement clo:clos) {
                productName=clo.getText();
                break;
            }
        }
        return productName;
    }

    public void FinishingCheckProcess(){
        TermsCheckListBtn.click();
        checkOutBtn.click();
    }

}
