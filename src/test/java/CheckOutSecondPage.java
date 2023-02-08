import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutSecondPage extends BaseClass{

    //Initializing a variables
    HomePage homePage = new HomePage(driver);
    By finishOrderButton = By.xpath("//button[@id='finish']");
    By productTextValueCheckOutPage = By.xpath("//div[@class=\"inventory_item_name\"]");

    //Method to validate the Product is still the same to Cart
    public void validateProductNameInCheckOutPage(){
        Assert.assertEquals("The product is not the same.", homePage.getProductNameValue(), getText(productTextValueCheckOutPage));
    }

    //Method to click on Finish order button
    public void finishOrder(){clickElement(finishOrderButton);}
    public CheckOutSecondPage(WebDriver driver) {super(driver);
    }
}
