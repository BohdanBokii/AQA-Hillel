import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver getDriver(String brows) {
        WebDriver driver = null;
        BROWSER browser = BROWSER.valueOf(brows);
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
        return new ChromeDriver();
    }
}

