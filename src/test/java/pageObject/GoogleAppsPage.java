package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class GoogleAppsPage extends Util {
    @FindBy(className = "gb_D") private WebElement btnApp;
    @FindBy(xpath = "//li[@class = 'j1ei8c'][10]") private WebElement btnDrive;


    public GoogleAppsPage() {
        PageFactory.initElements(driver,this);
    }

    public void ingresarGoogleDrive(){

        wait.until(ExpectedConditions.visibilityOf(btnApp));
        btnApp.click();

        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.visibilityOf(btnDrive));
        btnDrive.click();


    }
}
