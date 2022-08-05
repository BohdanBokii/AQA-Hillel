package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;

import java.util.List;

import static java.lang.System.out;

public class BlogPage {

    private WebDriver driver;
    @FindBy(xpath = "//li[@class=\"theme-list_item\"]")
    List<WebElement> listBlogMenu;

    @FindBy(xpath = "//ul[contains(@class, 'posts_list') and contains(@class, post-list)]")
    WebElement listNews;

    public void printHrefListBlogMenu() {
        for (WebElement l : listBlogMenu) {
            out.println(l.findElement(By.tagName("a")).getAttribute("href"));
        }
    }

    public void clickBlogMenu(String name) {
        for (WebElement l : listBlogMenu) {
            if (l.findElement(By.tagName("a")).getAttribute("href").contains(name)) {
                l.click();
                break;
            }
        }
    }

    public int getAmountListNews() {
        return listNews.findElements(By.cssSelector("li.post-list_item")).size();
    }

    public BlogPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
