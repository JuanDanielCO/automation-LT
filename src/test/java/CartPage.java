import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BaseClass{

    By checkOutButton = By.xpath("//button[@id='checkout']");
    By productTextValueCartPage = By.xpath("//div[@class=\"inventory_item_name\"]");

    public void validateProductName(){
        Assert.assertEquals("The product is not the same.", "Sauce Labs Backpack", getText(productTextValueCartPage));
    }
    public void checkOutProduct(){
        clickElement(checkOutButton);
    }
    public CartPage(WebDriver driver) {
        super(driver);
    }
}
