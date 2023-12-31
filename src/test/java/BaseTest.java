import Pages.LoginPage;
import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = Browser.getDriver();
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    public LoginPage startLoginPage() {
        return PageFactory.initElements(Browser.driver, LoginPage.class);
    }
}
