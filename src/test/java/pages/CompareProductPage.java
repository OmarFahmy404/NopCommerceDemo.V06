package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompareProductPage {
    WebDriver driver;
    HomePage homePage;

    public CompareProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "table[class=\"compare-products-table\"]")
    WebElement compareProductTable;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/a")
    WebElement clearListBtn;


    public Dimension GetDimension(){
       // homePage.RedirectToProductComparison();
        Dimension size = null;
        List<WebElement> rows=compareProductTable.findElements(By.tagName("tr"));
        for (WebElement row:rows) {
            List<WebElement> clos=compareProductTable.findElements(By.tagName("td"));
            for(WebElement clo:clos){
               size= clo.getSize();
            }
        }
        return size;
    }

    public boolean ClearListBtnIsDisplayed(){
        return clearListBtn.isDisplayed();
    }
}
