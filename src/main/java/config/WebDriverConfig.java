package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static config.AppConfig.URL;

public class WebDriverConfig {

    public static final long WAIT_SECONDS_TIMEOUT = 10;
    public static WebDriver get() {
        WebDriver driver = new ChromeDriver();
//        String browserName = System.getenv().get("browser");
//
//        WebDriver driver;
//        switch (browserName) {
//            case "chrome":
//                driver = new ChromeDriver();
//                break;
//            case "firefox":
//                driver = new FirefoxDriver();
//                break;
//            default: throw new  RuntimeException("Browser " + browserName + " not exist");
//        }

        driver.manage().timeouts().implicitlyWait(WAIT_SECONDS_TIMEOUT, TimeUnit.SECONDS);
        driver.navigate().to(URL);
        return driver;
    }
}
