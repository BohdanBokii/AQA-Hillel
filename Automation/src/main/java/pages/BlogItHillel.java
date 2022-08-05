package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogItHillel {
    private WebDriver driver;

    @FindBy(xpath = "//li[contains(@class, '-blog')and contains(@class, 'site-nav-menu_item')]/a")
    WebElement blogButton;
    public void clickBlogButton() {
        blogButton.click();
    }

    public BlogItHillel(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}

