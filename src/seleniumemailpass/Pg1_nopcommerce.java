package seleniumemailpass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Pg1_nopcommerce {
    static WebDriver driver;
    static String url= "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        ChromeOptions browser =new ChromeOptions();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
       String title=driver.getTitle();
        System.out.println("Title is "+title);
        String CURL=driver.getCurrentUrl();
        System.out.println("Current Url is "+CURL);
        String page=driver.getPageSource();
        System.out.println("Page source is "+page);
        WebElement logIn = driver.findElement(By.xpath("//div[@class='header-links']/ul/li[2]"));
        logIn.click();
        WebElement email=driver.findElement(By.xpath("//div[@class='form-fields']/div/input"));
        email.click();
        email.sendKeys("abc@yahoo.com");
        WebElement password=driver.findElement(By.xpath("//div[@class='form-fields']/div[2]/input"));
        password.click();
        password.sendKeys("12345");
        driver.quit();
   }
}
