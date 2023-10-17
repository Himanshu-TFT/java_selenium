package AdvanceSeleniumDemo.ParallelTestExecution.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxTest {
    @Test
    public void test()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println("firefox: "+ Thread.currentThread().getId());


    }
}
