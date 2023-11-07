package resources.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BrowserDriver {
    public static WebDriver wd;
    public static ChromeOptions options;

    public BrowserDriver() {
        this.wd = wd;

    }

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    public void closeDriverGracefully() {
        wd.close();
//        wd.quit();
    }

}
