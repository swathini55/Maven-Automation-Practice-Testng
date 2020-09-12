package PageObject;

import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends TestBase {

    WebDriver hdriver;

    public Homepage(WebDriver hmeDriver) {
        hdriver = hmeDriver;
        PageFactory.initElements(hmeDriver,this);
    }

    @FindBy(className = "navigation_page")//my account page title
    WebElement showtxtaccpage;

    public Homepage() {

    }

    public String accountpage()
    {
        return showtxtaccpage.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'Home')]") //my accunt homebutton
    WebElement clkHomebutn;
    public void gomainpage()
    {
        clkHomebutn.click();
    }


@FindBy(xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]") //sub category t shirt

      WebElement tshirtbutn;

    public void tshirtselect() {
        tshirtbutn.click();
    }
    @FindBy(className = "icon-list-ol") //order histry and details
    WebElement ordrHistrybutn;

    @FindBy(className = "icon-heart") //wishlist button
    WebElement wishlistbutn;

    @FindBy(className = "icon-ban-circle") //creditslips
    WebElement creditslipsbutn;

    @FindBy(className = "icon-building")//myaccunt adress
    WebElement myaddrsbutn;

    @FindBy(className = "icon-user") //myaccount personal information
    WebElement prsnlinfobutn;

    @FindBy(linkText="Sign out")
    WebElement samesingout;
    /*String singouttext= samesingout.getText();

    public String validatesingout()
    {
        return singouttext;
    }*/
    public boolean validateHomepage()  {

            return samesingout.isDisplayed();
    }

}
