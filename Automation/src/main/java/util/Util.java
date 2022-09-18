package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util {

    public static void waitVisibilityOfElement(WebDriver driver, WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void scrollToElementVisibilityOf(WebDriver d, By by) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        boolean bool = false;
        while (!bool) {
            try {
                d.findElement(by);
                js.executeScript("window.scrollBy(0,500)");
                Thread.sleep(1000);
            } catch (Exception ignore) {
                bool = true;
            }
        }
    }
}
