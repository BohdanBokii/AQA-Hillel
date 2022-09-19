import DriverConfig.BROWSER;
import DriverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {
    static final By SEARCH = By.xpath("//*[@id=\"about-school-trigger\"]/div");
    static final String BASEURL = "https://ithillel.ua/";

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getDriver(BROWSER.valueOf("CHROME"));
        driver.get(BASEURL);
        /*Checking the loading of page by element*/
        System.out.println(driver.findElement(By.id("btn-consultation-hero")).isDisplayed());
        /*Checking the loading of a particular element*/
        System.out.println(driver.findElement(SEARCH).isDisplayed());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {
            throw new RuntimeException(ignore);
        }

        driver.quit();
    }
}
