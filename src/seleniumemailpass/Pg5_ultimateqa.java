package seleniumemailpass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Pg5_ultimateqa {
    static WebDriver driver;
    static String url="https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        System.out.println("Title "+driver.getTitle());
        System.out.println("Url "+driver.getCurrentUrl());
        System.out.println("PageSource "+driver.getPageSource());
        WebElement email=driver.findElement(By.id("user[email]"));
        email.click();
        email.sendKeys("anish@gmail.com");
        WebElement pass=driver.findElement(By.name("user[password]"));
        pass.click();
        pass.sendKeys("1234");
        WebElement login=driver.findElement(By.xpath("//article[@class='sign-in__form']/form/div[5]/button"));
        login.click();
        driver.quit();
    }
}
