package TestNG_Demo.Basics.DataProviderDemo.DataProviderDemo2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo1 {
    @Test(dataProvider ="dataSet")
    public void test(Object data[]){
        System.out.println(data[0]+" "+ data[1]);

    }

    @DataProvider(name = "dataSet")
    Object[][] dataProvider(){
        Object[][] data = new Object[2][2];
        data[0][0]="Himanshu";
        data[0][1]="software traineee";
        data[1][0]="Himanshu";
        data[1][1]="software developer";
        return data;
    }
}
