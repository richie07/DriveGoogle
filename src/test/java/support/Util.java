package support;

import definitions.Hooks;
import model.DocumentData;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends Hooks {
    public static WebDriverWait wait;

    public Util() {

        wait = new WebDriverWait(driver,30);
    }

    public void openNewWindows(){
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }


}
