package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {
    @Description("Open the app.vwo.com url and get the title")
    @Test
    public void test_Assertion(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is available");
        }else{
            System.out.println("CURA Healthcare Service is not available");
        }
        driver.close();
    }
}
