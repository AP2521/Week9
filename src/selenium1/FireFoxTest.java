package selenium1;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FireFoxTest {
    static WebDriver driver;
    static String url="https://www.google.com/";

    public static void main(String[] args) {
        FirefoxOptions browser= new FirefoxOptions();
        driver=new FirefoxDriver(browser);
        driver.get(url);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));
        driver.quit();
    }
}
