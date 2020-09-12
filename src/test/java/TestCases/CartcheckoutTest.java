package TestCases;

import PageObject.Loginpage;
import PageObject.Purchasedress;
import TestBase.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartcheckoutTest extends TestBase {

    Loginpage loginpage;
    Purchasedress purchasedress;

    public CartcheckoutTest()
    {
        super();
    }
    @BeforeTest
    public void setup()  {
        initialize();
        loginpage = new Loginpage(drivertb);
        purchasedress = new Purchasedress(drivertb);

    }
    @Test()
public void dresspurch()
    {
       loginpage.validateLoginPage();
       purchasedress.clkdress();
       purchasedress.setCausltab();
       purchasedress.setViwlist();
       purchasedress.setCartadd();
       purchasedress.proceed1();
       purchasedress.setPrcdsummary();
       purchasedress.setSigninbtn("selenium5@gmail.com","123456");
       purchasedress.setAddrchkout();
       purchasedress.setAgreechkbx();
       purchasedress.setShipngchkout();
       purchasedress.setBankwire();
       purchasedress.setConfirmorder();
    }

   /* public void setPlaceorder()
    {
       // placeorder.orderandshipping();
        String tit = loginpage.validateLoginPage();
        Assert.assertEquals(tit,"My Store");
        loginpage.login("selenium5@gmail.com","123456"); //
        loginpage.clicksubmit();
        homepage.accountpage();
         homepage.gomainpage();
        homepage.tshirtselect();
        loginpage.enlargeimage();
        placeorder.addcartfun();
        //loginpage.addcartfun();
       loginpage.prcdchkoutfun();
       loginpage.sumchkoutfun();
       loginpage.enblagreebox();
       loginpage.shppngchkbutn();
       loginpage.bankpayment();
        loginpage.clickconfirm();
        loginpage.lgout();

    }
*/

    @AfterTest
    public void aftrtest()
    {
        drivertb.quit();
    }

}
