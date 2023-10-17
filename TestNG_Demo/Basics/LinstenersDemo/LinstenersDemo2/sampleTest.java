package TestNG_Demo.Basics.LinstenersDemo.LinstenersDemo2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNgListners.class)
public class sampleTest {

    @Test
    public void test(){
        System.out.println("this is demo tset");
    }
}
