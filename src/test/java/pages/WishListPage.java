package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WishListPage {
    WebDriver driver;
    public WishListPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (css = "table[class=\"cart\"]")
    WebElement table;


//    public By Rows(){
//        return By.tagName("tr");
//    }
//    public By Clos(){
//        return By.tagName("td");
//    }

    public Dimension GetInfoFromTable(){
        HomePage homePage=new HomePage(driver);
        homePage.ClickOnWishListTab();
        Dimension size = null;
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        for (WebElement row:rows) {
            List<WebElement> clos=table.findElements(By.tagName("td"));
            for (WebElement clo:clos) {
                size=clo.getSize();

            }

        }
        return size;
    }
}
