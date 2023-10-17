package TestNG_Demo.Basics.DataProviderDemo.DataProviderDemo2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo4 {

    @Test(dataProvider ="dataSet")
    public void test(String s[]){
        System.out.println(s[0]+" "+s[1]);
    }

    @DataProvider(name = "dataSet")
    Iterator<String[]> dataProvider(){
        List<String[]> l = new ArrayList<String[]>();
        l.add(new String[]{"himanshu","jadoun"});
        l.add(new String[]{"himanshu","jadoun"});
        return l.iterator();
    }
}
