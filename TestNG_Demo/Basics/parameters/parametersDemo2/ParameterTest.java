package TestNG_Demo.Basics.parameters.parametersDemo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","role","url"})
    public void Test(String name , String role, String url){
        System.out.println(name);
        System.out.println(role);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();
    }
}
