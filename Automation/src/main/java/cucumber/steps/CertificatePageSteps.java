package cucumber.steps;

import cucumber.BaseCucumber;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CertificatePage;

public class CertificatePageSteps extends BaseCucumber {

    private static final String mainURL = "https://certificate.ithillel.ua/";
    static CertificatePage certificatePage;

    @When("^I open site \"([^\"]*)\"$")
    public void iOpenSite(String siteURL) {
        driver.get(siteURL);
        switch (siteURL) {
            case mainURL:
                certificatePage = new CertificatePage(driver);
                break;
        }
    }

    @And("^Enter certificate number \"([^\"]*)\"$")
    public void enterCertificateNumber(String certificate) {
        certificatePage.getCertificateStatus(certificate);
    }

    @And("^Wait (\\d+)$")
    public void wait(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    @Then("^Check result$")
    public void checkResult() {
        String result = certificatePage.getMessage();

        Assert.assertEquals("Сертифікат не знайдено", result);
        System.out.println(result);
    }


}
