package TestNG_Demo.Basics.LinstenersDemo.LinstenersDemo2;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNgListners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("test is started");
    }
}
