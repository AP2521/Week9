package selenium2;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.Scanner;

public class MultibrowserTest {
    static WebDriver driver;
    static String url="https://www.google.com/";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser =sc.next();
        if (browser.equalsIgnoreCase("Chrome")){
            ChromeOptions options=new ChromeOptions();
            driver=new ChromeDriver(options);}
        else if (browser.equalsIgnoreCase("Firefox")){
            FirefoxOptions options = new FirefoxOptions();
            driver=new FirefoxDriver(options);}
        else if (browser.equalsIgnoreCase("Edge")){
            EdgeOptions options=new EdgeOptions();
            driver=new EdgeDriver(options);}
        else {
            System.out.println("Invalid browser enter again");
            sc.next();}
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Assert.assertTrue(url.equals(driver.getCurrentUrl()));
        driver.quit();
    }
}
