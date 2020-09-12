package PageObject;

import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchasedress extends TestBase {
    WebDriver purdriver;
    Loginpage loginpage;
    Homepage homepage;

    public Purchasedress(WebDriver pursedriver) {
        purdriver = pursedriver;
        PageFactory.initElements(pursedriver, this);

    }

    @FindBy(xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
    WebElement dresstab;
    public void clkdress()
    {
        dresstab.click();
    }

    @FindBy(xpath = "//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Casual Dresses')]")
    WebElement causltab;
    public void setCausltab()
    {
        causltab.click();
    }
    @FindBy(xpath = "//a[@class='product_img_link']//img[@class='replace-2x img-responsive']")
    WebElement qckview;
    public void quckview()
    {
        qckview.click();
    }


    @FindBy(xpath ="//i[@class='icon-th-list']")
    WebElement viwlist;
    public void setViwlist()
    {
        viwlist.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement cartadd;
    public void setCartadd()
    {

        cartadd.click();
    }

    //span[contains(text(),'Proceed to checkout')]
    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement prcdchkoutbutn;
    public void proceed1() {
        prcdchkoutbutn.click();
    }

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
    WebElement prcdsummary;
    public void setPrcdsummary()
    {
        prcdsummary.click();
    }

    @FindBy(xpath = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
    WebElement addrchkout;
    public void setAddrchkout()
    {
        addrchkout.click();
    }

    @FindBy(id = "email")
    WebElement emailid;
    @FindBy(id = "passwd")
    WebElement passwd;
    @FindBy(id = "SubmitLogin")
    WebElement signinbtn;

    public void setSigninbtn(String mailid, String pwd)
    {
        emailid.sendKeys(mailid);
        passwd.sendKeys(pwd);
        signinbtn.click();
    }

    @FindBy(xpath = "//input[@id='cgv']")
    WebElement agreechkbx;
    public void setAgreechkbx()
    {
        agreechkbx.click();
    }

    @FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
    WebElement shipngchkout;
    public void setShipngchkout()
    {
        shipngchkout.click();
    }

    @FindBy(xpath = "//a[@class='bankwire']")
    WebElement bankwire;
    public void setBankwire()
    {
        bankwire.click();
    }

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    WebElement confirmorder;
    public void setConfirmorder()
    {
        confirmorder.click();
    }
}
