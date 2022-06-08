package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    // here we gonna write our POM design pattern for login page

   public WebDriver driver;

    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
//////////////////////////////////////////////////////////////////////////////////
//    public WebElement computers(){
//        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
//    }
//    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
//    WebElement test;
    ////////////////////////////////////////////////////////////////////////////////
    @FindBy(css = "a[class=\"ico-register\"]")
    WebElement registerFB;

    @FindBy(id = "gender-male")
    WebElement maleRadioBtnFB;

   @FindBy(id = "FirstName")
   WebElement firstNameFieldFB;

    @FindBy(id="LastName")
    WebElement lastNameFieldFB ;

    public WebElement DayOfBirth(){
       WebElement dateOfBirthDay= driver.findElement(By.name("DateOfBirthDay"));
        return dateOfBirthDay;
    }

    @FindBy(name ="DateOfBirthMonth")
    WebElement  monthOfBirthDay ;

    @FindBy(name ="DateOfBirthYear")
    WebElement  yearOfBirthDay ;

    @FindBy(id="Email")
    WebElement  emailFieldFB ;

    @FindBy( id="Company")
    WebElement  companyNameFieldFB ;

    @FindBy( id="Password")
    WebElement  passwordFieldFB ;

    @FindBy( id="ConfirmPassword")
    WebElement  confirmPasswordFieldFB ;

    @FindBy(id = "register-button")
    WebElement registerBtn;

    public By TheRegistrationMess(){
        return By.cssSelector("div[class=\"result\"]");
    }

    public void RegisterStep(){
      //  System.out.println("tessst");
       // test.click();
        registerFB.click();
        maleRadioBtnFB.click();
        firstNameFieldFB.sendKeys("Omar");
        lastNameFieldFB.sendKeys("Fahmy");

        Select selectDay=new Select(DayOfBirth());
        selectDay.selectByVisibleText("30");
        Select selectMoth=new Select(monthOfBirthDay);
        selectMoth.selectByVisibleText("November");
        Select selectYear=new Select(yearOfBirthDay);
        selectYear.selectByVisibleText("1998");

        emailFieldFB.sendKeys("test5@n.com");
        companyNameFieldFB.sendKeys("N/A");
        passwordFieldFB.sendKeys("123456");
        confirmPasswordFieldFB.sendKeys("123456");

        registerBtn.click();


    }
}
