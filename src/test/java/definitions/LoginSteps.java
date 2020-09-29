package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.LoginData;
import pageObject.GoogleAppsPage;
import pageObject.GoogleDrivePage;
import pageObject.LoginPage;

public class LoginSteps {

    LoginPage login;
    LoginData dataUsers;
    GoogleAppsPage appsPage;
    GoogleDrivePage drive;

    public LoginSteps() {
        login = new LoginPage();
        dataUsers = new LoginData();
        appsPage = new GoogleAppsPage();
        drive = new GoogleDrivePage();
    }

    @And("enter password {string}")
    public void enterPassword(String password) {
        login.ingresarPassword(password);
    }

    @When("click boton continuar")
    public void clickBotonContinuar() {
        login.clickContinuar();
    }

    @Then("validate login sucessfull")
    public void validateLoginSucessfull() {
        login.validateLogin(dataUsers);
    }

    @Given("Usuario enter page Google")
    public void usuarioEnterPageGoogle()  {
        Hooks.driver.get("https://www.google.com/");

    }

    @And("enter {string}")
    public void enter(String correo){
        login.ingresarCorreo(correo);
        dataUsers.setCorreo(correo);
    }

    @And("enter opcion Drive")
    public void enterOpcionDrive() {
        appsPage.ingresarGoogleDrive();
        drive.clickIrDrive();
    }

    @And("click en continuar")
    public void clickEnContinuar() {
        login.clickIniciarSesion();
    }

    @And("enter {string} drive")
    public void enterDrive(String correo) {
        dataUsers.setCorreo(correo);
        login.openNewWindows();
        login.ingresarCorreo(correo);

    }

    @Then("validate login sucessfull drive")
    public void validateLoginSucessfullDrive() {
        login.validateLoginDrive(dataUsers);
    }
}
