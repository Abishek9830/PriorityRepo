package AmazonDataProvider;

import Utility.XLUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class GetProductInfoAmzn {
    @Test(dataProvider = "datas")
    public void getProductInfoTest(String brand, String product){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //search product
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brand, Keys.ENTER);
        //capture product information
        String xpath1 = "//span[text()='"+product+"']/../../../..//span[@class='a-price-whole']";
        String price = driver.findElement(By.xpath(xpath1)).getText();
        System.out.println(price);
        driver.quit();
    }


    @DataProvider
    public Object[][] datas() throws Exception {
        XLUtility xls = new XLUtility();
        int rows = xls.getRowCount("AMZN");
        Object[][] orr = new Object[rows][2];

        for (int i=0;i<rows;i++){
            orr [i][0]=xls.getXLSData("AMZN",i+1,0);
            orr [i][1]=xls.getXLSData("AMZN",i+1,1);
        }

        return orr;
    }
}
