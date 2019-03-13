package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/mohammadhamid/Desktop/PNT/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

    public void typeOnCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void clickOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void clearField(String locator) {
        driver.findElement(By.xpath(locator)).clear();
    }
    public void takeEnterKeys(String locator) {
        driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
    }
    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public String getCurrentPageUrl() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }

    public void goBackToHomeWindow() {
        driver.switchTo().defaultContent();
    }

    public static void sleepFor(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);

    }

    public void navigateBack() {
        driver.navigate().back();
    }


}

