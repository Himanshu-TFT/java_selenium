package AdvanceSeleniumDemo.Grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SampleTest2 extends BaseClass{
    public WebDriver driver;

    @Test
    public void testOne(){

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle()+"form firefox");
        System.out.println(driver.getCurrentUrl());

    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = initializeBrowser("firefox");

    }

    @AfterMethod
    public void teardown(){
//        driver.quit();

    }
}
