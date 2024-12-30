package Shadab_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sal002_DataProvider_Login_ID {

    @Test(dataProvider = "create")
    public void test(String username, String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        //Assert.assertEquals();
        driver.close();
    }
    @DataProvider(name = "create")
    public Object[][] dataSet1() {
        return new Object[][]
                {
                        {"standard_user", "secret_sauce"},
                        {"standard_user","invalid_pwd"},
                        {"locked_out_user","secret_sauce"},
                        {"problem_user","secret_sauce"},
                        {"performance_glitch_user","secret_sauce"},
                        {"error_user","secret_sauce"},
                        {"visual_user","secret_sauce"}

                };
    }

}
