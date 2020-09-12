package PageObject;

import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage extends TestBase {
    WebDriver logdriver;

    public Loginpage(WebDriver Lgdriver) {
        logdriver = Lgdriver;
        PageFactory.initElements(Lgdriver, this);
    }

    //homepage signinbutton navigate
    @FindBy(className = "login")
    WebElement butnHomesignin;

    public void navgsignin() {
        butnHomesignin.click();
    }


    @FindBy(name = "SubmitCreate")  //create buttonSubmitCreate
    @CacheLookup
    WebElement butncreateacc;

    public void clickcreate() {
        butncreateacc.click();
    }

    @FindBy(id = "email_create") //create mailid chk
            WebElement cretemailtxt;

    public void cretemailvalidchk(String mailchk) {
        cretemailtxt.clear();
        cretemailtxt.sendKeys(mailchk);
    }

    //error msg invalid mailID
    @FindBy(id = "create_account_error")
    WebElement errormsg;

    public String InvalidLogin() {
        return errormsg.getText();

    }

    //logocheck
    @FindBy(id = "header_logo")
    WebElement logoDispy;

    public boolean chklogo() {

        return logoDispy.isDisplayed();
    }

    public String validateLoginPage() {
        System.out.println(logdriver.getTitle());
        return logdriver.getTitle();
    }


    @FindBy(id = "email")  //login account emailID textbox
            WebElement txtemailId;

    public void setTxtemailId(String emailID) {
        txtemailId.clear();
        txtemailId.sendKeys("emailID");
    }

    @FindBy(id = "passwd")   // password textbox
            WebElement txtpwd;

    public void setpassword(String password) {
        txtpwd.sendKeys("password");
    }

    @FindBy(id = "SubmitLogin")  ////SignInButton
            WebElement btnSignin;

    public void clicksubmit() {
        btnSignin.click();
    }

    public Homepage login(String emailID, String password) {
        navgsignin();
        txtemailId.sendKeys(emailID);  //
        txtpwd.sendKeys(password);   //
        // btnSignin.click();
        chklogo();
        return new Homepage();
    }

    //************************add to cart
@FindBy(xpath = "//a[@class='product_img_link']//img[@class='replace-2x img-responsive']") //click on tshirt image
WebElement tshirtimage;
    public void enlargeimage()
    {
        tshirtimage.click();
    }



  //  @FindBy(className = "btn btn-default button button-medium") //proceed chechout butn
  //button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]
    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
            WebElement prcdchkoutbutn;
    public void prcdchkoutfun() {
        prcdchkoutbutn.click();
    }

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]") //final prooced chk out option butn
            WebElement prcdchkoutbutn2;

    public void sumchkoutfun() {
        prcdchkoutbutn2.click();
    }

    @FindBy(id = "uniform-cgv")//term and conditions chk box
            WebElement agreechkbox;
    public void enblagreebox()
    {
        agreechkbox.click();
    }

   // @FindBy(className = "button btn btn-default standard-checkout button-medium") //shipping tab proceed chk out butn
    @FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
   WebElement shipngprcdchkbutn;
    public void shppngchkbutn() {

        shipngprcdchkbutn.click();
    }

    @FindBy(xpath = "//a[@class='bankwire']") //payment tab bankwore option
            WebElement bankdetals;

    public void bankpayment()
    {
        bankdetals.click();
    }
    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]") //payment tab confirm order
    WebElement confirmorder;
    public void clickconfirm()
    {
        confirmorder.click();
        String co = confirmorder.getText();

    }

    @FindBy(linkText = "Sign out")//signout butn
    WebElement signoutbutnLP;
    public void lgout()
    {
        signoutbutnLP.click();
    }


}
