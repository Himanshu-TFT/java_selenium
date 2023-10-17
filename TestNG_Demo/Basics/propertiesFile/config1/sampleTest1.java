package TestNG_Demo.Basics.propertiesFile.config1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.Test;

public class sampleTest1 {

    WebDriver driver=null;
    public static String browserName = null;

    @Test
    public void test(){
        propertiesFile.getProperties();
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else {
            return;
        }

        driver.get("https://www.google.com/");

    }


}
