package cucumber;

import DriverConfig.BROWSER;
import DriverConfig.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseCucumber {
    protected static WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);
}
