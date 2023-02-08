import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BaseClass{

    //Initializing a variables
    HomePage homePage = new HomePage(driver);
    By checkOutButton = By.xpath("//button[@id='checkout']");
    By productTextValueCartPage = By.xpath("//div[@class=\"inventory_item_name\"]");

    //Method to validate the Product has been added to Cart
    public void validateProductName(){
        Assert.assertEquals("The product is not the same.", homePage.getProductNameValue(), getText(productTextValueCartPage));
    }

    //Method to click on CheckOut button
    public void checkOutProduct(){
        clickElement(checkOutButton);
    }
    public CartPage(WebDriver driver) {
        super(driver);
    }
}
