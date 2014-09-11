package sample;

import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * Created by yaohu on 6/18/14.
 */
public class amazonPOTest {
    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver", "/Users/yaohu/Documents/Tool/chromedriver");

        amazonHomePage amazon = new amazonHomePage();

        amazon.accessHomePage();

        amazon.search("Book");

        amazon.clickPurchaseButton();

        amazon.clickCartButton();

        assertThat(amazon.getProductNameFromCart(), equalTo("Murray McCain"));
    }

}
