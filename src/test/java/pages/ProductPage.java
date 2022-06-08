package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name= "giftcard_43.RecipientName")
    WebElement RecipientNameField;

    @FindBy(id = "giftcard_43_RecipientEmail")
    WebElement RecipientEmailField;

    @FindBy(id = "giftcard_43_SenderName")
    WebElement YourNameField;

    @FindBy(id = "giftcard_43_SenderEmail")
    WebElement YourEmailField;

    @FindBy(id = "giftcard_43_Message")
    WebElement MessageField;

    @FindBy(id = "add-to-wishlist-button-43")
    WebElement AddToWishListBtn;

    @FindBy(id = "product_enteredQuantity_4")
    WebElement quantityField;

    @FindBy(id = "add-to-cart-button-4")
    WebElement addToCartBtn;

    public void FirstAddingSteps(){
        RecipientNameField.sendKeys("test");
        RecipientEmailField.sendKeys("test147@yahoo.com");
        YourNameField.clear();
        YourNameField.sendKeys("omar fahmy");
        YourEmailField.clear();
        YourEmailField.sendKeys("omar@yahoo.com");
        MessageField.sendKeys("amazing product");
        AddToWishListBtn.click();
        driver.navigate().back();
        WishListPage wishListPage=new WishListPage(driver);
        wishListPage.GetInfoFromTable();
    }

    public void AddingToShoppingCart(){
        quantityField.clear();
        quantityField.sendKeys("2");
        addToCartBtn.click();
        driver.navigate().back();
    }

}
