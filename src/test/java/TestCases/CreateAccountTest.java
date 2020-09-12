package TestCases;

import PageObject.CreateAccountCustomer;
import PageObject.Homepage;
import PageObject.Loginpage;
import TestBase.TestBase;
import Utilities.TestUtilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class CreateAccountTest extends TestBase {

    Loginpage loginpage;
    Homepage homepage;
    CreateAccountCustomer createAccount;
    String sheetname = "Customer_Data";

   public CreateAccountTest()
   {
       super();


   }
   @BeforeTest
    public void setup()  {
       initialize();
       loginpage = new Loginpage(drivertb);
       homepage = new Homepage(drivertb);
       createAccount = new CreateAccountCustomer(drivertb);

   }

   @DataProvider
    public Object[][] getdata()
   {
       Object datas[][] = TestUtilities.getTestData(sheetname);
       return datas;

   }
   @Test(dataProvider = "getdata")
    public void createAcc(String CustFirstName, String CustLastName,String EmailID, String Password,String DOBday,String DOBmonths,
                          String DOByear,String psnlFName, String psnlLName,String Company,String Address,String Address2,String City,String State,
                          String Zipcode,String Country,String AdditionalInfo,String Homephone,String Mobilephone,String Futurerefence) throws IOException {

            loginpage.navgsignin();
            loginpage.cretemailvalidchk(property.getProperty("emailID"));
            // loginpage.setCretemailtxt(property.getProperty("emailID"));
            loginpage.clickcreate();
            createAccount.fill(CustFirstName,CustLastName,EmailID,Password,DOBday,DOBmonths,DOByear,psnlFName,psnlLName
          ,Company,Address,Address2,City,State,Zipcode,Country,AdditionalInfo, Homephone,Mobilephone,Futurerefence);
    //createAccount.clickregistrbtn();

   }

    @AfterMethod
    public void tearDown() throws IOException {
      TestUtilities.takeScreenshotAtEndOfTest();
       drivertb.quit();
    }


}
