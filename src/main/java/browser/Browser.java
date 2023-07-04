package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (Info.browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\sheheryarali.baig\\eclipse-workspace/chromedriver.exe");

            //WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (Info.browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
