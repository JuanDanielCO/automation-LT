import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass{

    //Initializing a variables
    By userName = By.xpath("//input[@id='user-name']");
    By userPassword = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");

    //Method to enter user's credentials
    public void enterCredentials(){
        sendKeys("standard_user", userName);
        sendKeys("secret_sauce", userPassword);
    }

    //Method to click on 'Login' Button
    public void clickOnLoginButton(){
        clickElement(loginButton);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
