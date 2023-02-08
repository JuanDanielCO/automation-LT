import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseClass {
    protected WebDriver driver;
    public BaseClass(WebDriver driver){
        this.driver = driver;
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void sendKeys(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void clickElement(By locator){
        driver.findElement(locator).click();
    }

}
