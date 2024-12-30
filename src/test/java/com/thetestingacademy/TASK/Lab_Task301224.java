package com.thetestingacademy.TASK;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_Task301224 {

    @Owner("Shadab")
    @Description("30 December Task")
    @Test
        public void LoginTest() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            WebElement id = driver.findElement(By.id("btn-make-appointment"));
            id.click();
            Thread.sleep(2000);
            WebElement userName = driver.findElement(By.name("username"));
            userName.sendKeys("John Doe");
            WebElement pwd = driver.findElement(By.id("txt-password"));
            pwd.sendKeys("ThisIsNotAPassword");
            WebElement btn = driver.findElement(By.id("btn-login"));
            btn.click();
            Thread.sleep(3000);

            String url= driver.getCurrentUrl();
            Assert.assertEquals(url,"https://katalon-demo-cura.herokuapp.com/#appointment");
            driver.close();

    }
}
