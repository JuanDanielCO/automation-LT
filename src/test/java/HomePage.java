import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass{

    By addButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By cartButton = By.xpath("//a[@class=\"shopping_cart_link\"]");


    public void addProductCart(){
        clickElement(addButton);
    }

    public void goToCartPage(){
        clickElement(cartButton);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
