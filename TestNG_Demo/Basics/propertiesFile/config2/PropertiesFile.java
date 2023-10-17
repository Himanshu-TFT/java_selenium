package TestNG_Demo.Basics.propertiesFile.config2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

    public static void main(String[] args) {
        PropertiesFile.getProperties();
    }

    static Properties p = new Properties();
    public static void getProperties() {
        try {
            InputStream input= new FileInputStream("C:\\Users\\Himanshu Jadoun\\Desktop\\java selenium\\TestNGDemo1_java\\src\\main\\java\\TestNG_Demo\\Basics\\propertiesFile\\config2\\config.properties");
            p.load(input);
            String browserName =p.getProperty("browser");
            System.out.println(browserName);
            sampleTest1.browserName= browserName;

        }catch (Exception e) {
            System.out.println(e.getCause());
        }

    }
    public static void setProperties(){
        try {
            OutputStream output = new FileOutputStream("C:\\Users\\Himanshu Jadoun\\Desktop\\java selenium\\TestNGDemo1_java\\src\\main\\java\\TestNG_Demo\\Basics\\propertiesFile\\config2\\config.properties");
            p.setProperty("test","pass");
            p.store(output,null);

        }catch (Exception e) {
            System.out.println(e.getCause());
        }
    }


}
