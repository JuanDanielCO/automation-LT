import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass{

    By userName = By.xpath("//input[@id='user-name']");
    By userPassword = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");

    public void loginUser(){
        sendKeys("standard_user", userName);
        sendKeys("secret_sauce", userPassword);
        clickElement(loginButton);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
