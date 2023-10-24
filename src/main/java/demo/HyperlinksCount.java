package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class HyperlinksCount{
    ChromeDriver driver;

    public HyperlinksCount(){
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

    public void  testCase01(){
//        Navigate to URL  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
//        Count the links present Using Locator "Tag Name" a and use size() method for list webElement
        List <WebElement> links = driver.findElements(By.tagName("a"));
//        Print the count of hyperlinks
        System.out.println("Number of Hyperlinks on the page : " + links.size());
    }
}