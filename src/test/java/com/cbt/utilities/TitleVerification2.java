package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws Exception{

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com " , "https://westelm.com/");
        // WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = BrowserFactory.getDriver("chrome");
        // In case if only one hyperlink contains only part of the title
        for (String each:urls) {
            driver.get(each);
            String t = driver.getTitle();
            if (each.contains(t.substring(0,t.indexOf(" ")).toLowerCase())){
                System.out.println("The title is the part of the url");
            } else {
                System.out.println("The title is NOT the part of the url");
            }
        }

        driver.quit();

    }
}
