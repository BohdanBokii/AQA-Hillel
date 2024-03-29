package DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver getDriver(BROWSER browser) {
        WebDriver driver = null;
        switch (browser) {
            case CHROME:
                driver = initChrome();
                break;
            case FIREFOX:
                driver = initFirefox();
                break;
        }
        return driver;
    }

    private static WebDriver initFirefox() {
        return new FirefoxDriver();
    }

    private static WebDriver initChrome() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\stan_\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        return new ChromeDriver(options);
    }
}
