package PractisetestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class DoliLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://49.249.28.218:8889/dolibarr/index.php?mainmenu=home");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"login-submit-wrapper\"]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"topmenu-login-dropdown\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"topmenu-login-dropdown\"]/div/div[3]/div[3]/a/span")).click();
    }
}
