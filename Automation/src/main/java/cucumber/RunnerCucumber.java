package cucumber;

import DriverConfig.BROWSER;
import DriverConfig.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/cucumber/features",
        glue = "cucumber.steps",
        tags = "@CertificateTest",
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE)

public class RunnerCucumber {

    @BeforeClass
    public static void start() {
        BaseCucumber.driver = DriverFactory.getDriver(BROWSER.CHROME);
    }

    @AfterClass
    public static void end() {
        BaseCucumber.driver.quit();
    }
}
