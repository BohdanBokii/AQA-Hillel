package pages;

import cucumber.BaseCucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatePage extends BaseCucumber {
    @FindBy(name = "certificate")
    WebElement certificateField;

    @FindBy(xpath = "//button[contains(@class, 'btn') and contains(@class, 'certificate-check_submit')]")
    WebElement buttonSubmit;

    @FindBy(xpath = "//p[@class='certificate-check_message']")
    WebElement certificateCheckMessage;

    public CertificatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void getCertificateStatus(String certificate) {
        certificateField.sendKeys(certificate);
        buttonSubmit.click();
    }

    public String getMessage()   {
        return certificateCheckMessage.getText();
    }

}
