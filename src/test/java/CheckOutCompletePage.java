import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage extends BaseClass{

    //Initializing a variables
    By orderCompletedText = By.xpath("//h2[@class=\"complete-header\"]");

    //Method to validate the order is completed
    public void validateOrderCompleted(){
        Assert.assertEquals("The order has not been completed.", "THANK YOU FOR YOUR ORDER", getText(orderCompletedText));
    }
    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }
}
