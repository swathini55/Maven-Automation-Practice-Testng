import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumGridTest {
   WebDriver driver;
   RemoteWebDriver driversel;
    DesiredCapabilities cap = null;
    String appurl= "https://parabank.parasoft.com/parabank/index.htm";

    @BeforeTest
    public void setup() throws MalformedURLException {

           System.setProperty("webdriver.chrome.driver", "C:/Users/vishwa/Drivers/Chrome/chromedriver.exe");
           String nodeid = "http://192.168.2.16:4444/wd/hub";
           cap = new DesiredCapabilities();
           cap.setBrowserName("chrome");
           cap.setVersion("84.0");
           cap.setPlatform(Platform.WIN10);
          ChromeOptions optns = new ChromeOptions();
          //cap.setCapability(ChromeOptions.CAPABILITY,optns);
           optns.merge(cap);
         driver = new RemoteWebDriver(new URL(nodeid),cap);

      /* ChromeOptions optns = new ChromeOptions();
         driversel = new RemoteWebDriver(new URL(nodeid),optns);*/

      /*  LoggingPreferences logprf = new LoggingPreferences();
        logprf.enable(LogType.PERFORMANCE, Level.ALL);
        capabilities.setCapability(CapabilityType.LOGGING_PREFS,logprf);
             driversel = new RemoteWebDriver(new URL(nodeid),capabilities);*/
       }



    @Test
    public  void sampletest(){

           driver.get(appurl);
           // Assert.assertEquals("ParaBank|Welcome|Online Banking",driversel.getTitle());
           String tit = driver.getTitle();

           if (tit.contains("ParaBank")) {
               System.out.println("test passed");
           } else {
               System.out.println("test failed");
           }
       }



    @AfterTest
    public void aftertest()  {
         driver.close();
    }


}
