package AdvanceSeleniumDemo.POM.POM_PageFactory_Demo3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class googleTest {

    WebDriver driver;



    @FindBy(id="APjFqb")
    WebElement textBox;


    public googleTest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void SendText(String text){
        textBox.sendKeys(text);
    }

    public void searchClick(){
        textBox.sendKeys(Keys.ENTER);
    }
}
