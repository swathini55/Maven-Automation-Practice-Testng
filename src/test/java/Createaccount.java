
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createaccount {
    WebDriver driver;

    public void launch()
    {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.className("login")).click();
        driver.findElement(By.name("email_create")).sendKeys("selenium@gmail.com");
       // driver.findElement(By.)
    }
    public void autogentrate() {


    }
}
