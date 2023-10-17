package TestNG_Demo.Basics.propertiesFile.config2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTest1 {
    public static String browserName = null;

    @Test
    public void test(){
        PropertiesFile.getProperties();
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
        }

    }
}
