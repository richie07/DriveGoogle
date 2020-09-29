package pageObject;

import model.DocumentData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleDrivePage extends Util{

    @FindBy(xpath = "//div[@class='drive__hero-buttons']/a[contains(text(),'Ir a Drive')]") private WebElement btnIrDrive;

    @FindBy(xpath = "//button[@guidedhelpid='new_menu_button']") private WebElement btnNew;
    @FindBy(xpath = "//*[contains(text(),'Documentos de Google')]") private WebElement btnDocumento;
    @FindBy(xpath = "//div[starts-with(text(),'E01_Richard Francisco Pinedo Calle_')][1]") private WebElement lbldocumento;


    public GoogleDrivePage() {
        PageFactory.initElements(driver,this);

    }

    public void clickIrDrive(){
        wait.until(ExpectedConditions.elementToBeClickable(btnIrDrive));
        btnIrDrive.click();
    }


    public void crearDocumento(){
        wait.until(ExpectedConditions.visibilityOf(btnNew));
        btnNew.click();
        wait.until(ExpectedConditions.visibilityOf(btnDocumento));
        btnDocumento.click();
        openNewWindows();


    }

    public void validateCreateDocumento(DocumentData documento){
        wait.until(ExpectedConditions.visibilityOf(lbldocumento));
        Assert.assertTrue(documento.getName().contains(lbldocumento.getText()));

    }






}
