package seleniumemailpass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Pg2_Opensource {
    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {
        ChromeOptions browser=new ChromeOptions();
        driver=new ChromeDriver();
        driver.get(url);
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        WebElement username=driver.findElement(By.xpath("//div[@class='orangehrm-login-form']/form/div/div/div[2]/input"));
         username.click();
         username.sendKeys("Admin");
         WebElement pass=driver.findElement(By.xpath("//form[@class='oxd-form']/div[2]/div/div[2]/input"));
         pass.click();
         pass.sendKeys("admin123");
         WebElement login=driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/button"));
         login.click();
         driver.quit();
    }
}
