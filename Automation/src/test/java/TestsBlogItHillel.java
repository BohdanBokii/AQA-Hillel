import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import pages.BlogItHillel;
import pages.BlogPage;
import util.Util;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestsBlogItHillel extends Base {
    private static final String BASEURL = "https://ithillel.ua/";
    private static BlogItHillel Blog;
    private static BlogPage blogPage;

    @Parameterized.Parameter
    public String topic;

    @Parameterized.BeforeParam
    public static void beforeParam() {
        driver.get(BASEURL);

        Blog = new BlogItHillel(driver);
        Blog.clickBlogButton();

        blogPage = new BlogPage(driver);
    }

    //Parameterized test
    @Parameterized.Parameters(name = "{index}: Topic - {0}")
    public static Object[] data() {
        return new Object[]{
                "frontend",
                "qa",
                "management",
                "marketing"
        };
    }
        @Test
        public void testBlogNews() {
            // Arrange

            // Act
            blogPage.clickBlogMenu(topic);
            Util.scrollToElementVisibilityOf(driver, By.cssSelector("div.posts_spinner"));

            // Assert
            int count = blogPage.getAmountListNews();
            System.out.println(topic + " news: " + count);
            Assert.assertNotEquals(0, count);
        }
    }

