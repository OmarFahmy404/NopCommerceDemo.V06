package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "img[title=\"Show products in category Electronics\"]")
    WebElement electronicCategory;

    @FindBy(css = "img[title=\"Show products in category Apparel\"]")
    WebElement apparelCategory;

    @FindBy(css = "img[title=\"Show products in category Digital downloads\"]")
    WebElement digitalDownloadsCategory;

    @FindBy(id = "small-searchterms")
    WebElement searchField;

    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    WebElement searchBtn;

    @FindBy(css = "img[title=\"Show details for $25 Virtual Gift Card\"]")
    WebElement virtualGiftCardPhoto;

    @FindBy(css = "img[title=\"Show details for Apple MacBook Pro 13-inch\"]")
    WebElement appleMacBookProAddToCartTab;

    @FindBy(css = "a[class=\"ico-wishlist\"]")
    WebElement wishListTab;

    @FindBy(css = "span[class=\"cart-label\"]")
    WebElement shoppingCartTab;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[2]")
    WebElement addCompareListTabOfFirstProduct;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]")
    WebElement addCompareListTabOfSecondProduct;

    @FindBy(xpath = "/html/body/div[5]/div/p")
    WebElement message;

    @FindBy(xpath = "/html/body/div[5]/div/p/a")
    WebElement linkMessage;

    @FindBy(css = "a[href=\"/apparel\"]")
    WebElement apparelTab;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a")
    WebElement shoes;


    public void HoverSteps(){
        Actions hover=new Actions(driver);
        hover.moveToElement(electronicCategory).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        hover.moveToElement(apparelCategory).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        hover.moveToElement(digitalDownloadsCategory).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void SelectCategories(){
        electronicCategory.click();
        driver.navigate().back();
        apparelCategory.click();
        driver.navigate().back();
        digitalDownloadsCategory.click();

    }

    public void SearchingForProduct(String s){
        searchField.sendKeys(s);
        searchBtn.click();
    }

    public void AddToWishList(){
        virtualGiftCardPhoto.click();
        ProductPage productPage=new ProductPage(driver);
        productPage.FirstAddingSteps();

    }

    public void ClickOnWishListTab(){
        wishListTab.click();
    }

    public void AddingToShoppingCart(){
        appleMacBookProAddToCartTab.click();
        ProductPage productPage=new ProductPage(driver);
        productPage.AddingToShoppingCart();
    }

    public void ClickOnShoppingCartTab(){
        shoppingCartTab.click();
    }

    public void ComparisonProcessSteps(){
        addCompareListTabOfFirstProduct.click();
        addCompareListTabOfSecondProduct.click();
//        linkMessage.click();
        }
        public String GetMessage(){
        return message.getText();
        }


        public void OpenShoesPage(){
            List<WebElement> categories=driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]"));
            for (WebElement Category:categories){
                List<WebElement> apparelCategories=driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]"));
                for (WebElement apparelCategory:apparelCategories){
                    apparelCategory.click();
                    break;
                }

            }
            ApparelPage apparelPage=new ApparelPage(driver);
            apparelPage.OpenShoesCategory();
//            Select select=new Select(apparelTab);
//            select.selectByVisibleText("Shoes");

        }


    }






