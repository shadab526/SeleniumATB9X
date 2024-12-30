package com.thetestingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium02 {
    @Description("Open the app.vwo.com url and get the title")
    @Test
    public void test_URL(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.close();
    }
}
