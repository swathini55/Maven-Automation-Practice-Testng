import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlineShopping {
    WebDriver driver ;

    public void launch()
    {
        System.setProperty("webdriver.chrome.driver","C:/Users/vishwa/Drivers/Chrome/chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("http://www.automationpractice.com/");
        String pgtitle = driver.getTitle();
        System.out.println("Page Tile : "+pgtitle);
    }
    public void navigate() //signin button
    {
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        String signinbutton  = driver.findElement(By.className("login")).getText();
        System.out.println(signinbutton);

    }
    public void login() throws InterruptedException {
        driver.findElement(By.id("email_create")).clear();
        WebDriverWait wait1 = new WebDriverWait(driver,10);
        driver.findElement(By.id("email_create")).sendKeys("selenium4@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(3000);
        //String errmsg = driver.findElement(By.xpath("//div[@id='create_account_error']")).getText();
        //System.out.println("Error Message : " +errmsg);
        String creatAccPge=driver.findElement(By.className("page-subheading")).getText();
        System.out.println(creatAccPge);
        Thread.sleep(3000);

    }

    public void register() throws InterruptedException {
        String creatAccPge=driver.findElement(By.className("page-subheading")).getText();
        System.out.println(creatAccPge);
        driver.findElement(By.id("id_gender2")).click(); //Mrs
        driver.findElement(By.name("customer_firstname")).sendKeys("Sathiya");//1st name
        driver.findElement(By.name("customer_lastname")).sendKeys("Sundar");//lastname
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("selenium4@gmail.com"); //emailID
        driver.findElement(By.id("passwd")).sendKeys("bitsai1$");
      Thread.sleep(1000);
        Select date = new Select(driver.findElement(By.id("days")));
        date.selectByValue("14"); //only values avail
        Thread.sleep(1000);
        Select month = new Select(driver.findElement(By.id("months")));
        month.selectByValue("7");
        Thread.sleep(1000);
        Select year = new Select(driver.findElement(By.id("years")));
        year.selectByValue("1991");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#newsletter")).click(); //newsletter
        driver.findElement(By.cssSelector("#optin")).click(); //specil partners
        driver.findElement(By.id("firstname")).sendKeys("Sathiya");//firstname
        driver.findElement(By.name("lastname")).sendKeys("Sundar"); //last name
        driver.findElement(By.id("company")).sendKeys("BitsAI.Inc"); //company
        driver.findElement(By.name("address1")).sendKeys("120, Waller Street, Markham"); //address
        driver.findElement(By.id("address2")).sendKeys("Near Town GO Station");  //address2
        driver.findElement(By.name("city")).sendKeys("North York"); //city
        Thread.sleep(1000);
        Select province = new Select(driver.findElement(By.name("id_state")));  //state
        province.selectByValue("32"); //newyork
        Thread.sleep(1000);
        driver.findElement(By.name("postcode")).sendKeys("10036");//zipcode 10036
        driver.findElement(By.id("id_country")).sendKeys("United States"); //country
        driver.findElement(By.name("other")).sendKeys("Testing !!! Thanks for the Website");//additinal info
        driver.findElement(By.name("phone")).sendKeys("189456123");// homephone
        driver.findElement(By.id("phone_mobile")).sendKeys("123456987");// mobile
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Abc Company, Ontario");//assign address alias
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click(); //register button
    }
    public void myaccount() throws InterruptedException {
       Thread.sleep(1000);
       String myaccpage = driver.findElement(By.className("info-account")).getText();
        System.out.println(myaccpage);
     }

     public void signoutacc()
     {
         driver.findElement(By.className("logout")).click();
     }
    public void closebrows()
    {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {

        OnlineShopping os = new OnlineShopping();
        os.launch();
        os.navigate();
        os.login();
        os.register();
        os.myaccount();
       // os.signoutacc();
        //os.closebrows();
    }
}
