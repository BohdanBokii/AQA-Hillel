package cucumber.steps;

import cucumber.BaseCucumber;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePage;

public class CertificatePageSteps extends BaseCucumber {
    CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);
    private final String mainURL = "https://certificate.ithillel.ua/";

    @When("^I open site \"([^\"]*)\"$")
    public void iOpenSite(String siteURL) throws Throwable {
        driver.get(siteURL);
        switch (siteURL) {
            case mainURL:
                certificatePage = new CertificatePage(driver);
                certificatePage = PageFactory.initElements(driver, CertificatePage.class);
                break;
        }
    }

    @And("^Enter certificate code <Certificate>$")
    public void enterCertificateCodeCertificate(String Certificate) {
        certificatePage.getCertificateStatus(Certificate);
    }

    @Then("^Check result$")
    public void checkResult() {
        Assert.assertNotEquals(certificatePage.getMessage(), "Сертифікат не знайдено");
    }
}
