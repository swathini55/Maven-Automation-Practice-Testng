package TestCases;


import PageObject.Homepage;
import PageObject.Loginpage;
import TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    Loginpage loginpage;
    Homepage homepage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setup()  {
        initialize();
        loginpage = new Loginpage(drivertb);
        homepage = new Homepage(drivertb);
    }

    @Test(priority = 1)
    public void loginpagetitletest()
    {
        String tit = loginpage.validateLoginPage();
        Assert.assertEquals(tit,"My Store");

    }
    @Test(priority = 2)
    public void logoTest()
    {
        boolean logo = loginpage.chklogo();
        Assert.assertTrue(logo);
    }

    @Test(priority = 3)
    public void navpagesignin()
    {
        loginpage.navgsignin();
    }

    @Test(priority = 4)
    public void logintest() throws InterruptedException {

    //  loginpage.setTxtemailId(property.getProperty("emailID"));
    //   loginpage.setpassword(property.getProperty("password"));
        homepage = loginpage.login(property.getProperty("emailID"),property.getProperty("password")); //
         loginpage.clicksubmit();
     // String expval=homepage.validatesingout();
     // Assert.assertEquals(expval,homepage.singouttext);
        //Thread.sleep(1000);
     boolean samesingout= homepage.validateHomepage();
     Assert.assertTrue(samesingout);

    }
    @AfterMethod
    public void tearDown()
    {
        drivertb.quit();
    }
}
