package AdvanceSeleniumDemo.POM.POM_PageFactory_Demo3.SampleTest;
import AdvanceSeleniumDemo.POM.POM_PageFactory_Demo3.Pages.googleTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTest {
    @Test
    public void GoogleTest(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        googleTest t = new googleTest(driver);
        t.SendText("himanshu");
        t.searchClick();
    }
}
