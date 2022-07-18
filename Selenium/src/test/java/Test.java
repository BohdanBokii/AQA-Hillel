import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Test {
    static final String BASEURL = "https://online.ithillel.ua/courses/qa-automation";
    /*static final By Search = By.name();*/

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getDriver("CHROME");
        driver.get(BASEURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Button = driver.findElement(By.id("modal-quiz-trigger"));
        Button.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {
            throw new RuntimeException(ignore);
        }

        driver.quit();
    }
}
