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

    public void setUp(){
        //System. setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/resources/drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        wd.get("http://www.globalsqa.com/demo-site/draganddrop/");
        System.out.println(wd.getTitle());
        System.out.println(wd.getCurrentUrl());
    }

    public void closeDriverGracefully() {
        wd.close();
        wd.quit();
    }

}
