package capstone.pharmeasy.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import capstone.pharmeasy.webfactory.WebDriverFactory;



public class BaseClass {
	public static WebDriver driver;
    public static Properties prop;
    static String projectpath = System.getProperty("user.dir");

    static {
        try {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream(projectpath + "/config/config.properties");
            prop.load(fileInputStream);
        } catch (IOException io) {
            System.out.println("Exception thrown at BaseClass static block");
        }
    }

    
    public static WebDriver initializeDriver() {
        String browserName = prop.getProperty("browser.name");
        try {
            driver = WebDriverFactory.getInstance(browserName);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(prop.getProperty("site.url"));
           
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        return driver;
    }

}
