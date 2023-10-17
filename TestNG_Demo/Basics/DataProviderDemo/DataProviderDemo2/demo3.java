package TestNG_Demo.Basics.DataProviderDemo.DataProviderDemo2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo3 {

    @Test(dataProvider ="dataSet")
    public void test(String s){
        System.out.println(s);
    }

    @DataProvider(name = "dataSet")
    Iterator<String> dataProvider(){
        List<String > l= new ArrayList<String>();
        l.add("Himanshu");
        l.add("jadoun");
        return l.iterator();
    }
}
