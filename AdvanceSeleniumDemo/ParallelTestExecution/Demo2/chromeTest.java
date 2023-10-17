package AdvanceSeleniumDemo.ParallelTestExecution.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeTest {

    @Test
    public void test()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println("chrome: "+ Thread.currentThread().getId());


    }
}
