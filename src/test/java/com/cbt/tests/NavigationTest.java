package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTest {

    static WebDriver driver;
    public static void main(String[] args) throws Exception{
    chromeTest();
    //fireFoxTest();
    //safariTest();

    }

    public static void chromeTest() throws Exception{
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
         driver = BrowserFactory.getDriver("chrome");
         Thread.sleep(2000);

         driver.get("http://google.com");
         Thread.sleep(3000);
        String title = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String title2 = driver.getTitle();
        driver.navigate().back();
        title = driver.getTitle();
         driver.quit();
    }

    public static void fireFoxTest() throws Exception{
         driver = BrowserFactory.getDriver("firefox");
        Thread.sleep(2000);
         driver.quit();
    }

    public static void safariTest() throws Exception {

        driver = BrowserFactory.getDriver("safari");
        Thread.sleep(2000);
        driver.quit();
    }
}
