package PageObject;

import TestBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Placeorder extends TestBase {
    WebDriver orddriver;
    Loginpage loginpage;
    Homepage homepage;

    public Placeorder(WebDriver ordriver) {
        orddriver = ordriver;
        PageFactory.initElements(ordriver, this);
    }

    //  @FindBy(className = "exclusive") //tshirt ADD to cart butn
      // @FindBy(id = "add_to_cart")
   //  @FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']")
 // @FindBy(xpath = "//p[@id='add_to_cart']")
   //  @FindBy(name = "Submit")
   // @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
                       //span[contains(text(),'Add to cart')]
   @FindBy(xpath = "//button[@name='Submit']")
   // @FindBy(className = "buttons_bottom_block no-print")

    WebElement addcartbutn;
    public void addcartfun() {
        drivertb.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
        // addcartbutn.click();
    }
    /*public void orderandshipping()
    {
    String tit = loginpage.validateLoginPage();
        Assert.assertEquals(tit,"My Store");
        loginpage.login("selenium5@gmail.com","123456"); //
        loginpage.clicksubmit();
        homepage.gomainpage();
        homepage.tshirtselect();
        loginpage.addcartfun();
        loginpage.prcdchkoutfun();
        loginpage.sumchkoutfun();
         loginpage.shppngchkbutn();
         loginpage.bankdetals.click();
         loginpage.confirmorder.click();
         loginpage.signoutbutnLP.click();

}*/
}
