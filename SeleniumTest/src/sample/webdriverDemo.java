package sample;

/**
 * Created by yaohu on 6/10/14.
 */
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriverDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yaohu/Documents/Tool/chromedriver");

        //初始化driver对象
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //访问Amazon主页
        //driver.get("http://www.amazon.cn");



        driver.navigate().to("http://blog.sina.com.cn/s/blog_62830e600101jo9c.html");

//
//        driver.navigate().forward();
//        driver.navigate().back();
//
//
//        String pageSource = driver.getPageSource();
//

       // driver.close();



        //boolean b = pageSource.contains("amazon");


//        //在搜索框里输入Book
//        WebElement searchBoxElement = driver.findElement(By.id("nav-iss-attach"));
//        searchBoxElement.sendKeys("Book");
//
//        //提交表单，查询Book
        //searchBoxElement.submit();

        //点击购买按钮
//*[@id="sina_keyword_ad_area2"]/div/div/div[7]/code[2]/select

        //Select selectAge = new Select(driver.findElement(By.xpath("//*[@id=\"sina_keyword_ad_area2\"]/div/div/div[7]/code[2]/select")));

        WebElement inputField = driver.findElement(By.id("password-id"));
        inputField.clear();
        inputField.sendKeys("test");
        inputField.getText();

        Select selectAge = new Select(driver.findElement(By.xpath("//*[@id=\"sin\"]/div/se")));
        selectAge.selectByIndex(3);

        WebElement bookRadioButton = driver.findElement(By.id("BookMode"));
        bookRadioButton.click();
        bookRadioButton.isSelected();

        WebElement saveButton = driver.findElement(By.id("save"));
        saveButton.click();
        saveButton.isEnabled();






//
//        Select selectAge = new Select(driver.findElement(By.id("User_age")));
//
//        selectAge.selectByIndex(1);




//
//        driver.findElement(By.name("submit.addToCart"));
//
//
//        driver.findElement(By.className("nav-submit-input"));
//
//
//        driver.findElement(By.id("twotabsearchtextbox"));
//
//
//        driver.findElement(By.xpath("//*[@id=\"cart\"]/span[2]"));
//
//
//        driver.findElement(By.cssSelector("#twotabsearchtextbox"));



        //#twotabsearchtextbox



    }
}
