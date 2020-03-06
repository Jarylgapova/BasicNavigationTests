package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) throws Exception{
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com " , "https://westelm.com/");

        for (String each:urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(each);
            String t = driver.getTitle();
            if (each.contains(t.substring(0,t.indexOf(" ")).toLowerCase())){
                System.out.println("The title is the part of the url");
                System.out.println();
            } else {
                System.out.println("The title is NOT the part of the url");
            }
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
