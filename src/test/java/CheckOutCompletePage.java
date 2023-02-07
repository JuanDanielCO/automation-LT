import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage extends BaseClass{

    By orderCompletedText = By.xpath("//h2[@class=\"complete-header\"]");

    public void validateOrderCompleted(){
        Assert.assertEquals("The order has been completed.", "THANK YOU FOR YOUR ORDER", getText(orderCompletedText));
    }
    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }
}
