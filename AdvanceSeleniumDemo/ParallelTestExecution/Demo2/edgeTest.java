package AdvanceSeleniumDemo.ParallelTestExecution.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class edgeTest {
    @Test
    public void test()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println("edge: "+ Thread.currentThread().getId());

    }
}
