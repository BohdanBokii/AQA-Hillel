package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatePage {

    WebDriver driver;

    @FindBy(name = "certificate")
    WebElement certificateField;

    @FindBy(xpath = "//button[contains(@class, 'btn') and contains(@class, 'certificate-check_submit')]")
    WebElement submitButton;

    @FindBy(xpath = "//p[@class='certificate-check_message']")
    WebElement certificateCheckMessage;

    public void getCertificateStatus(String certificate) {
        certificateField.sendKeys(certificate);
        submitButton.click();
    }

    public String getMessage() {
        return certificateCheckMessage.getText();
    }
    public CertificatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
