package pageObject;

import model.LoginData;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;


public class LoginPage extends Util {
    //private WebDriver driver;

    @FindBy(id = "gb_70") private WebElement btnIniciarSesion;
    @FindBy(id = "identifierId") private WebElement txtCorreo;
    @FindBy(className = "VfPpkd-RLmnJb") private WebElement btnSiguiente;
    @FindBy(name = "password") private WebElement txtPassword;
    @FindBy(xpath = "//span[contains(text(),'Siguiente')]//ancestor::button") private WebElement btnSiguienteP;
    @FindBy(xpath = "//img[@class='gb_Ia gbii']//ancestor::a") private WebElement txtOcultoCorreo;


    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public void ingresarCorreo(String correo){
       wait.until(ExpectedConditions.visibilityOf(txtCorreo));
        txtCorreo.sendKeys(correo);
        btnSiguiente.click();
    }

    public void clickIniciarSesion(){
        btnIniciarSesion.click();
    }

    public void ingresarPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(password);
    }

    public void clickContinuar(){
        btnSiguienteP.sendKeys(Keys.ENTER);
    }


    public void validateLogin(LoginData ld) {
        wait.until(ExpectedConditions.visibilityOf(txtOcultoCorreo));
        Assert.assertTrue(txtOcultoCorreo.getAttribute("title").contains(ld.getCorreo()));


    }

    public void validateLoginDrive(LoginData ld){
        wait.until(ExpectedConditions.visibilityOf(txtOcultoCorreo));
        Assert.assertTrue(txtOcultoCorreo.getAttribute("aria-label").contains(ld.getCorreo()));
    }


}
