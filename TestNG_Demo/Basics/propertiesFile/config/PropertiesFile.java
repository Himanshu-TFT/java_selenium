package TestNG_Demo.Basics.propertiesFile.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
    static Properties prop = new Properties();
    static String projectPath= System.getProperty("user.dir");

//    public static void main(String[] args) {
//        getProperties();
//        setProperties();
//        getProperties();
//
//    }
    public static void getProperties(){
        try{
            InputStream input= new FileInputStream("C:\\Users\\Himanshu Jadoun\\Desktop\\java selenium\\TestNGDemo1_java\\src\\main\\java\\TestNG_Demo\\Basics\\propertiesFile\\config\\config.properties");
            prop.load(input);
            String browser= prop.getProperty("browser");
            System.out.println(browser);
            GoogleTitleTest.browserName=browser;
            SampleTest.browserName=browser;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void setProperties()
    {
        try{

            OutputStream output= new FileOutputStream(projectPath+"/src/main/java/TestNG_Demo/Basics/config/config.properties");
            prop.setProperty("Result","Pass");
            prop.store(output,null);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }

    }
}
