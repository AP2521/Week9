package seleniumemailpass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Pg4_saucedemo {
    static WebDriver driver;
    static String url="https://www.saucedemo.com/";

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        System.out.println("Title "+driver.getTitle());
        System.out.println("Url "+driver.getCurrentUrl());
        System.out.println("PageSource "+driver.getPageSource());
        WebElement username=driver.findElement(By.xpath("//div[@id='login_button_container']/div/form/div/input"));
        username.click();
        username.sendKeys("standard_user");
       // WebElement pass=driver.findElement(By.xpath("//div[@id='login_button_container']/div/form/div[2]/input"));
        WebElement pass =driver.findElement(By.name("password"));
        pass.click();
        pass.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.id("login-button"));
        login.click();
        //driver.quit();

    }
}
