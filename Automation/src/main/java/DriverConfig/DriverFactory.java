package DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

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
        String dataFolder = System.getenv("LOCALAPPDATA");
        String chromeExe = "Google\\Chrome\\Application\\chrome.exe";
        Path chromeDrivePath = Paths.get(dataFolder, chromeExe);

        options.setBinary(chromeDrivePath.toString());
        return new ChromeDriver(options);
    }
}
