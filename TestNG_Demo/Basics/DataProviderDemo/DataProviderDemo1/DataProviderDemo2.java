package TestNG_Demo.Basics.DataProviderDemo.DataProviderDemo1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2{

    @Test(dataProvider = "dp1")
    void test1(String data){

        System.out.println(data);
    }

    @DataProvider()
    public String[] dp1(){

        String[] d =new String[]{"login1", "login3"};
        return d;
    }
}
