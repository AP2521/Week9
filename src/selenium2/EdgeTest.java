package selenium2;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {
    WebDriver driver;
    String url="https://www.google.com/";
    public static void main(String[] args){
        EdgeOptions options=new EdgeOptions();
        EdgeTest a=new EdgeTest();
        a.driver=new EdgeDriver(options);
        a.driver.get(a.url);
        a.driver.manage().window().maximize();
        a.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        System.out.println(a.driver.getCurrentUrl());
        System.out.println(a.driver.getTitle());
        Assert.assertTrue(a.url.equals(a.driver.getCurrentUrl()));
        a.driver.quit();
    }
}
