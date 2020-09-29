package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.DocumentData;
import pageObject.DocumentDrivePage;
import pageObject.GoogleAppsPage;
import pageObject.GoogleDrivePage;

public class CreateDocumentSteps {
    GoogleAppsPage appsPage;
    GoogleDrivePage drive;
    DocumentDrivePage documentPage;
    DocumentData dataDocument;


    public CreateDocumentSteps() {
        appsPage = new GoogleAppsPage();
        drive = new GoogleDrivePage();
        documentPage = new DocumentDrivePage();
        dataDocument = new DocumentData();
    }

    @When("return document page principal")
    public void returnDocumentPagePrincipal() {
        documentPage.returnPagePrincipal();
    }

    @Given("User create one document text {string} with time")
    public void userCreateOneDocumentTextWithTime(String name) {
        drive.crearDocumento();
        documentPage.changeDocumentName(name,dataDocument);
    }

    @Then("User should see my document create")
    public void userShouldSeeMyDocumentCreate() {
        drive.validateCreateDocumento(dataDocument);

    }
}
