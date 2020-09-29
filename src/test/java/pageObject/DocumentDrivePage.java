package pageObject;

import model.DocumentData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DocumentDrivePage extends Util {


    @FindBy(className = "docs-title-input") private WebElement txtDocumento;
    @FindBy(xpath = "//div[@id='docs-branding-container']") private WebElement btnRegresarPrincipal;
    @FindBy(xpath = "//*[contains(text(),'Guardado en Drive')]") private WebElement lblIndicador;



    public DocumentDrivePage() {
        PageFactory.initElements(driver,this);

    }

    public void changeDocumentName(String name,DocumentData documento){
        wait.until(ExpectedConditions.visibilityOf(txtDocumento));
        txtDocumento.click();
        documento.setName(name+getHourSystem());
        txtDocumento.sendKeys(documento.getName());
        txtDocumento.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(lblIndicador));

    }

    public void returnPagePrincipal(){
        wait.until(ExpectedConditions.visibilityOf(btnRegresarPrincipal));
        btnRegresarPrincipal.click();

    }

    private String getHourSystem(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);

    }
}
