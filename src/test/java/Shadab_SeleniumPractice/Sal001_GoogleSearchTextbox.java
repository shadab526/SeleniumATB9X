package Shadab_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sal001_GoogleSearchTextbox {
    @Test
    public void test_GoogleSearch(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id = 'APjFqb']")).sendKeys("Yahoo.com");
        driver.findElement(By.xpath("//textarea[@id = 'APjFqb']")).submit();
        driver.close();







    }
}