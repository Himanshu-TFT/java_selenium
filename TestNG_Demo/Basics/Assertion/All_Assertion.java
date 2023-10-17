package TestNG_Demo.Basics.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class All_Assertion {

    @Test
    public void softAssert(){
        SoftAssert asserions = new SoftAssert();
        asserions.assertEquals(1, 2);
        System.out.println("this is soft assert");
    }

    @Test
    public void hardAssert(){
        Assert.assertTrue(true);
        Assert.assertEquals(1, 1);
        Assert.assertFalse(false);
        Assert.assertNotEquals(4, 7);
        System.out.println("this is a hard assertion");
    }
}
