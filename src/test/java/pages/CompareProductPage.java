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

    public CompareProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "table[class=\"compare-products-table\"]")
    WebElement compareProductTable;

    public Dimension GetDimension(){
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
}
