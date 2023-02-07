import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutFirstPage extends BaseClass{


    By userFirstName = By.xpath("//input[@id='first-name']");
    By userLastName = By.xpath("//input[@id='last-name']");
    By userPostalCode = By.xpath("//input[@id='postal-code']");
    By continueButton = By.xpath("//input[@id='continue']");

    public void fillFormCheckOut(){
        sendKeys("Automation", userFirstName);
        sendKeys("Exercise", userLastName);
        sendKeys("1234", userPostalCode);
         clickElement(continueButton);
    }
    public CheckOutFirstPage(WebDriver driver) {
        super(driver);
    }
}
