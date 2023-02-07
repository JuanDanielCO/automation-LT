import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutSecondPage extends BaseClass{

    By finishOrderButton = By.xpath("//button[@id='finish']");
    By productTextValueCheckOutPage = By.xpath("//div[@class=\"inventory_item_name\"]");

    public void validateProductNameInCheckOutPage(){
        Assert.assertEquals("The product is not the same.", "Sauce Labs Backpack", getText(productTextValueCheckOutPage));
    }
        public void finishOrder(){
            clickElement(finishOrderButton);
        }
        public CheckOutSecondPage(WebDriver driver) {
        super(driver);
    }
}
