package AdvanceSeleniumDemo.ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class ALLActionsDemo {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        Actions a = new Actions(driver);
        WebElement butn = driver.findElement(By.linkText("Demos"));
        WebElement dragPage = driver.findElement(By.linkText("Draggable"));
        a.moveToElement(butn).perform();
        a.moveToElement(dragPage).click().build().perform();
        driver.switchTo().frame(0);
        WebElement dragableBox = driver.findElement(By.id("draggable"));
        System.out.println(dragableBox.getLocation());
        a.moveToElement(dragableBox).dragAndDropBy(dragableBox,15,15).build().perform();

        driver.get("https://jqueryui.com");
        WebElement dropPage= driver.findElement(By.linkText("Droppable"));
        a.moveToElement(dropPage).click().build().perform();
        driver.switchTo().frame(0);
        WebElement dragable = driver.findElement(By.id("draggable"));
        WebElement dropable= driver.findElement(By.id("droppable"));
        a.dragAndDrop(dragable, dropable).build().perform();

        driver.get("https://jqueryui.com");
        WebElement resizablePage= driver.findElement(By.linkText("Resizable"));
        a.moveToElement(resizablePage).click().build().perform();
        driver.switchTo().frame(0);
        WebElement resizable = driver.findElement(By.xpath("//*[@id='resizable']/child::div[3]"));
        System.out.println(resizable.getLocation());
        a.moveToElement(resizable).dragAndDropBy(resizable,50,50).build().perform();


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement element= driver.findElement(By.name("username"));


        a.keyDown(Keys.SHIFT).perform();
        element.sendKeys("admin");
        a.keyUp(Keys.SHIFT).perform();

    }
}
