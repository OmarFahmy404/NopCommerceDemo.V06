package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;
    Select select;

    public CheckOutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryDropdownList ;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement  stateDropdownList;

    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField ;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1Field ;

    @FindBy(id = "BillingNewAddress_Address2")
    WebElement address2Field;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement ZipCodeField;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement  phoneNumberField;

    @FindBy(id = "BillingNewAddress_FaxNumber")
    WebElement faxNumberField ;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")
    WebElement continueBtn1;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")
    WebElement continueBtn2;

    @FindBy(id="paymentmethod_1")
    WebElement creditCardRadioBtn;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")
    WebElement continueBtn3;

    @FindBy(id = "CreditCardType")
    WebElement selectCreditCardDropdownList;

    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;

    @FindBy(id = "CardNumber")
    WebElement cardNumberField;

    @FindBy(id = "ExpireMonth")
    WebElement expireMonthDropdownList;

    @FindBy(id = "ExpireYear")
    WebElement expireYearDropdownList;

    @FindBy(id = "CardCode")
    WebElement cardCodeField;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")
    WebElement continueBtn4;

    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")
    WebElement confirmBtn;


    public void FillingBillingFields(){
        select=new Select(countryDropdownList);
        select.selectByVisibleText("Egypt");
        select=new Select(stateDropdownList);
      //  select.selectByVisibleText("Other");
        cityField.sendKeys("Desouk");
        address1Field.sendKeys("Desouk1");
        address2Field.sendKeys("Desouk2");
        ZipCodeField.sendKeys("11511");
        phoneNumberField.sendKeys("01092355610");
        faxNumberField.sendKeys("212-963-2377");
        continueBtn1.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        continueBtn2.click();

        creditCardRadioBtn.click();
        continueBtn3.click();

        select=new Select(selectCreditCardDropdownList);
        select.selectByVisibleText("Master card");
        cardHolderNameField.sendKeys("AHLY PRPAID");
        cardNumberField.sendKeys("5338134808389802");
        select=new Select(expireMonthDropdownList);
        select.selectByVisibleText("11");
        select=new Select(expireYearDropdownList);
        select.selectByVisibleText("2023");
        cardCodeField.sendKeys("405");
        continueBtn4.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        confirmBtn.click();
    }
}
