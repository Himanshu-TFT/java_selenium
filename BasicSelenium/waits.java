package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class waits {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/signup");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btn =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("websubmit"))));
        btn.click();

        driver.navigate().to("https://www.facebook.com/signup");

        Wait w = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        WebElement btn1= (WebElement) w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("websubmit"))));
        btn1.click();

    }
}
