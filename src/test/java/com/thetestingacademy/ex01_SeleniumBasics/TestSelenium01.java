package com.thetestingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium01 {
    @Description("Open the app.vwo.com url and get the title")
    @Test
    public void test_Title(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        driver.close();
    }
}
