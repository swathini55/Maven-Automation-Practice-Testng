package TestBase;

import Utilities.TestUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver drivertb;
    public static Properties property;

    public TestBase()
    {
        property = new Properties();
        try {
        FileInputStream fip = new FileInputStream("C:/Users/vishwa/MavenProject/src/main/resources/Config.Properties");
                    property.load(fip);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void initialize()  {
        String browser = property.getProperty("Browser");

        if ("Firefox".equals(browser)) {
            System.setProperty("webdriver.gecko.driver",property.getProperty("Firefox"));

            drivertb = new FirefoxDriver();
        } else if ("Chrome".equals(browser)) {
            System.setProperty("webdriver.chrome.driver",property.getProperty("Chrome"));

            drivertb = new ChromeDriver();

        } else {
            System.setProperty("webdriver.ie.driver",property.getProperty("IE"));

            drivertb = new InternetExplorerDriver();
        }

        drivertb.manage().window().maximize();
        drivertb.manage().deleteAllCookies();
        drivertb.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        drivertb.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        drivertb.get(property.getProperty("appURL"));

    }
}
