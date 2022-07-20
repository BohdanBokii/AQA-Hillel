import DriverConfig.BROWSER;
import DriverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import pages.JavaBasic;

public class Test {
    static final By SEARCH = By.xpath("//*[@id=\"about-school-trigger\"]/div");
    static final String BASEURL = "https://ithillel.ua/";

    public static void main(String[] args) {
        /*--------------------------------------------HomeWork9------------------------------------*/
        /*WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);
        driver.get(BASEURL);

        //Checking the loading of page by element
        System.out.println(driver.findElement(By.id("btn-consultation-hero")).isDisplayed());
        //Checking the loading of a particular element
        System.out.println(driver.findElement(SEARCH).isDisplayed());
        driver.quit();*/
        /*------------------------------------------HomeWork11------------------------------------*/
        JavaBasic page = new JavaBasic();
        System.out.println(page.getCourseTitle());
        System.out.println(page.getCourseRate());
        System.out.println(page.getCourseDescription());

        page.quit();
    }
}

