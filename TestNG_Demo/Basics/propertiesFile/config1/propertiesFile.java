package TestNG_Demo.Basics.propertiesFile.config1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesFile {

    public static void main(String[] args) {
        propertiesFile.getProperties();
        propertiesFile.setProperties();
    }
    static Properties p = new Properties();

    static void getProperties(){
        try{
            InputStream input = new FileInputStream("C:\\Users\\Himanshu Jadoun\\Desktop\\java selenium\\TestNGDemo1_java\\src\\main\\java\\TestNG_Demo\\Basics\\propertiesFile\\config1\\config.properties");
            p.load(input);
            String BrowseName = p.getProperty("browser");
            sampleTest1.browserName=BrowseName;
            System.out.println(BrowseName);
        }
        catch(Exception e){
            System.out.println(e.getCause());
        }
    }

    static void setProperties(){
        try{

            OutputStream output =new FileOutputStream("C:\\Users\\Himanshu Jadoun\\Desktop\\java selenium\\TestNGDemo1_java\\src\\main\\java\\TestNG_Demo\\Basics\\propertiesFile\\config1\\config.properties");
            p.setProperty("test","pass");
            p.store(output,null);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }

}
