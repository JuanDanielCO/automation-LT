import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseClass {
    private WebDriver driver;

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

    public Boolean isDisplayed(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

}
