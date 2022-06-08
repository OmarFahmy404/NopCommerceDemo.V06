package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ShoesPage {
    WebDriver driver;

    public ShoesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "attribute-option-14")
    WebElement grayColor;

    @FindBy(id = "attribute-option-15")
    WebElement redColor;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/a/img")
    WebElement redShoes;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")
    WebElement grayShoes;

    public void SelectAndUnSelectColor(){
        grayColor.click();
        grayColor.click();

    }
    public void SelectNewColor(){
        redColor.click();
    }

    public boolean IsRedShoesDisplay(){
        return redShoes.isEnabled();
    }
    public boolean IsGrayShoesDisplay(){
        return grayShoes.isDisplayed();
    }
    public boolean IsGraySelected(){
        return grayColor.isSelected();
    }



}
