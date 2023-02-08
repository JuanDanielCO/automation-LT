import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutFirstPage extends BaseClass{

    //Initializing a variables
    By userFirstName = By.xpath("//input[@id='first-name']");
    By userLastName = By.xpath("//input[@id='last-name']");
    By userPostalCode = By.xpath("//input[@id='postal-code']");
    By continueButton = By.xpath("//input[@id='continue']");

    //Method to fill the user's info form
    public void fillFormCheckOut(){
        sendKeys("Automation", userFirstName);
        sendKeys("Exercise", userLastName);
        sendKeys("1234", userPostalCode);
    }

    //Method to click on Continue button
    public void continueWithOrder(){
        clickElement(continueButton);
    }
    public CheckOutFirstPage(WebDriver driver) {
        super(driver);
    }
}
