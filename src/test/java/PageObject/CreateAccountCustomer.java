package PageObject;

import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountCustomer extends TestBase {
    WebDriver custdriver;

    public CreateAccountCustomer(WebDriver createdriver)
    {
        custdriver=createdriver;
        PageFactory.initElements(createdriver,this);
    }

    @FindBy(id = "id_gender1")
    WebElement mr;

    @FindBy(id = "id_gender2")  //Title
    WebElement mrs;

    @FindBy(id = "customer_firstname")  //cust_First_Name
    WebElement custFN;

    @FindBy(id = "customer_lastname")   //custmerLastName
    WebElement custLN;

    @FindBy(id="email") //emailid
    WebElement mailID;

    @FindBy(id = "passwd")      //password
    WebElement pwd;

    @FindBy(id = "days")    //DOBdays
    WebElement dobdays;
    public void selctdays(String valday)
    {
        Select selday = new Select(dobdays);
        selday.selectByValue(valday);
    }

    @FindBy(id = "months")  //DOBmonths
    WebElement months;
    public void selctmonth(String valmonth)
    {
        Select selmonth = new Select(months);
        selmonth.selectByValue(valmonth);
    }

    @FindBy(id = "years")   //DOBmonths
    WebElement year;
    public void selctyear(String valyear)
    {
        Select selyear=new Select(year);
        selyear.selectByValue(valyear);
    }

    @FindBy(id = "newsletter")  //newsletter chkbox
    WebElement newlettr;

    @FindBy(id = "optin")   //signupoffer chkbox
    WebElement offrchk;

    @FindBy(id = "firstname")   //personalinfo firstname
    WebElement perFN;

    @FindBy(id = "lastname")    //personal info lastname
    WebElement perLN;

    @FindBy(id = "company")     //comanyname
    WebElement compny;

    @FindBy(id = "address1")    //addr1
    WebElement address1;

    @FindBy(id = "address2")    //addr2
    WebElement address2;

    @FindBy(id = "city")    //city
    WebElement cityLoc;

    @FindBy(id = "id_state")    //state listbox
    WebElement province;
    public void selctstate(String valstate)
    {
        Select selState = new Select(province);
        selState.selectByValue(valstate);
    }

    @FindBy(id = "postcode")
    WebElement postalcode;

    @FindBy(id = "id_country")
    WebElement country;
    public void selctCountry(String cntry)
    {
        Select selcountry = new Select(country);
        selcountry.selectByValue(cntry);
    }

    @FindBy(id = "other")   //otherinformation
    WebElement addinfo;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "phone_mobile")
    WebElement mobile;

    @FindBy(id = "alias")
    WebElement alias;

    @FindBy(id = "submitAccount") //register button
    WebElement registrbutn;
    public void clickregistrbtn()
    {
        registrbutn.click();
    }

    public void fill(String fname, String lname, String email, String paswd, String dobDay,
                     String dobMonth, String dobYr, String fName, String lName, String cmpy,
                     String addr1, String addr2, String city, String state, String zip, String Country,
                     String ainfo, String hphone, String mob, String futureRf)
    {
        mr.click();
        custFN.sendKeys(fname);
        custLN.sendKeys(lname);
        mailID.clear();
        mailID.sendKeys(email);
        pwd.sendKeys(paswd);
        dobdays.sendKeys(dobDay);
        months.sendKeys(dobMonth);
        year.sendKeys(dobYr);
        newlettr.click();
        offrchk.click();
        perFN.sendKeys(fName);
        perLN.sendKeys(lName);
        compny.sendKeys(cmpy);
        address1.sendKeys(addr1);
        address2.sendKeys(addr2);
        cityLoc.sendKeys(city);
        province.sendKeys(state);
        postalcode.sendKeys(zip);
        country.sendKeys(Country);
        addinfo.sendKeys(ainfo);
        phone.sendKeys(hphone);
        mobile.sendKeys(mob);
        alias.sendKeys(futureRf);
       // registrbutn.click();




    }
    

}
