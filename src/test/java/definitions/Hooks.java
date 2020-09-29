package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public static void tearDown(){
        if (driver != null){
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
        driver = null;
    }
}
