package TestNG_Demo.Basics.DataProviderDemo.DataProviderDemo2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo2 {

    @Test(dataProvider = "dataSet")
    public void test(String data){
        System.out.println(data);

    }
    @DataProvider
    String[] dataSet() {
        String[] data = new String[4];
        data[0] = "himanshu";
        data[1] = "jadoun";
        data[2] = "himanshu";
        data[3] = "jadoun";
        return  data;
    }
}
