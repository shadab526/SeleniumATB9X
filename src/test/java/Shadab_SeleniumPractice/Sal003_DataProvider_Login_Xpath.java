package Shadab_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Sal003_DataProvider_Login_Xpath {
    @Test(dataProvider = "Login Set")
    public void test_DP_Login_Xpath(String username, String password){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
        driver.close();
    }





    @DataProvider(name = "Login Set")
    public Object[][] dataset(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"standard_user","Invalid_PWD"},
                {"locked_out_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"},
                {"error_user","secret_sauce"},
                {"visual_user","secret_sauce"}
        };
    }
}
