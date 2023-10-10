package TestNG_Demo.Basics;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

    @Test(invocationTimeOut = 2, expectedExceptions=NumberFormatException.class)
    public void infiniteLoopTest(){
        int i=1;
        while(i==1)
        {
            System.out.println(i);
        }
    }

    @Test(timeOut = 200, expectedExceptions=NumberFormatException.class)
    public void infiniteLoopTest1(){
        int i=1;
        while(i==1)
        {
            System.out.println(i);
        }
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void test1()
    {
        String x="100A";
        Integer.parseInt(x);
    }

}
