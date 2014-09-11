package sample;

/**
 * Created by yaohu on 6/18/14.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class amazonHomePage {
    private WebDriver driver;

//    public WebDriver getDriver(){
//        return driver;
//    }

    public amazonHomePage(){
        driver = new ChromeDriver();
    }

    public void accessHomePage(){
        driver.get("http://www.amazon.cn");
    }

    public void search(String searchKey){
        WebElement searchBoxElement = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchBoxElement.sendKeys(searchKey);
        searchBoxElement.submit();
    }

    public void clickPurchaseButton(){
        driver.findElement(By.name("submit.addToCart")).click();
    }

    public void clickCartButton(){
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]")).click();
    }

    public String getProductNameFromCart(){
        return driver.findElement(By.xpath("//*[@id=\"activeCartViewForm\"]/div[2]/div/div[4]/div[2]/div[1]/div/div/div[2]/ul/li[1]/span/span")).getText();
    }


}
