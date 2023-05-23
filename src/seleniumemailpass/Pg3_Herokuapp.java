package seleniumemailpass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Pg3_Herokuapp {
    static WebDriver driver;
    static String url="http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        System.out.println("Title "+driver.getTitle());
        System.out.println("Url "+driver.getCurrentUrl());
        System.out.println("PageSource "+driver.getPageSource());
        WebElement username=driver.findElement(By.xpath("//form[@name='login']/div/div/input"));
        username.click();
        username.sendKeys("abcd");
        WebElement pass=driver.findElement(By.xpath("//form[@name='login']/div[2]/div/input"));
        pass.click();
        pass.sendKeys("1234");
        driver.quit();
    }
}
