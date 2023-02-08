import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
    String driverPath = ".\\src\\main\\resources\\drivers\\chromedriver.exe";
    WebDriver driver;

    LoginPage objLoginPage;
    HomePage objHomePage;
    CartPage objCartPage;
    CheckOutFirstPage objCheckOutFirstPage;
    CheckOutSecondPage objCheckOutSecondPage;
    CheckOutCompletePage objCheckOutCompletePage;

    @BeforeTest
    public void setUpTest(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void login_to_sauceDemo_webPage(){
        objLoginPage = new LoginPage(driver);
        objLoginPage.enterCredentials();
        objLoginPage.clickOnLoginButton();
    }

    @Test(priority = 2)
    public void get_to_homePage_sauceDemo_webPage(){
        objHomePage = new HomePage(driver);
        objHomePage.addProductCart();
        objHomePage.goToCartPage();
    }

    @Test(priority = 3)
    public void get_to_cartPage_sauceDemo_webPage(){
        objCartPage = new CartPage(driver);
        objCartPage.validateProductName();
        objCartPage.checkOutProduct();
    }

    @Test(priority = 4)
    public void get_to_firstCheckOutPage_sauceDemo_webPage() {
        objCheckOutFirstPage = new CheckOutFirstPage(driver);
        objCheckOutFirstPage.fillFormCheckOut();
        objCheckOutFirstPage.continueWithOrder();
    }

    @Test(priority = 5)
    public void get_to_secondCheckOutPage_sauceDemo_webPage() {
        objCheckOutSecondPage = new CheckOutSecondPage(driver);
        objCheckOutSecondPage.validateProductNameInCheckOutPage();
        objCheckOutSecondPage.finishOrder();
    }

    @Test(priority = 6)
    public void get_to_completeCheckOutPage_sauceDemo_webPage() {
        objCheckOutCompletePage = new CheckOutCompletePage(driver);
        objCheckOutCompletePage.validateOrderCompleted();
    }

    @AfterTest
    public void closeTest(){
        driver.quit();
    }


}
