package org.fasttrackit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    @Test

    public void registerTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();

        WebElement register = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a"));
        register.click();

        driver.findElement(By.cssSelector("#firstname")).sendKeys("matteo");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("matt");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("matteo");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("matteozalau_ro@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("matteo");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("matteo");
        driver.findElement(By.cssSelector("#is_subscribed")).sendKeys("matteo");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        WebElement errormessage = driver.findElement(By.xpath("//span[contains(text(),'There is already an account ')]"));
        Assert.assertTrue(errormessage.isDisplayed());
        driver.quit();
    }
}
