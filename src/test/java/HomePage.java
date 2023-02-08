import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass{

    //Initializing a variables
    By getProductNameValue = By.xpath("//div[@class=\"inventory_item_name\"]");
    By addButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By cartButton = By.xpath("//a[@class=\"shopping_cart_link\"]");


    //Method to get the Product Name value
    public String getProductNameValue(){
        return getText(getProductNameValue);
    }
    //Method to click on add product to cart
    public void addProductCart(){
        clickElement(addButton);
    }

    //Method to go to Cart page
    public void goToCartPage(){
        clickElement(cartButton);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
