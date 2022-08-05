import DriverConfig.BROWSER;
import DriverConfig.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class Base {
    protected static WebDriver driver;

    @BeforeClass
    public static void start() {
        driver = DriverFactory.getDriver(BROWSER.CHROME);
    }

    @AfterClass
    public static void end() {
        driver.quit();
    }
}
