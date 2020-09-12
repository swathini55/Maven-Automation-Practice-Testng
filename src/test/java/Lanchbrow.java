import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lanchbrow {
    public static void main(String[] args) {
        WebDriver driver;
        String pgTitle;

        System.setProperty("webdriver.gecko.driver","C:/Users/vishwa/Drivers/Firefox/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");

    }





}
