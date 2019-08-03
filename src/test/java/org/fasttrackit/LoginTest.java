package org.fasttrackit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
   public void validLoginTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();

        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("matteozalau_ro@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("matteo");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement account = driver.findElement(By.xpath("//a/span[text()='Account']"));
        account.click();
        WebElement logout = driver.findElement(By.xpath("//a[text()='Log Out']"));
        Assert.assertTrue(logout.isDisplayed());
        driver.quit();
    }

     @Test

    public void negativePasswordLoginTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();

        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("matteozalau_ro@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("125546dscqw2");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement errorMsg = driver.findElement(By.xpath("//span[contains(text(),'Invalid login or password')]"));
        Assert.assertTrue(errorMsg.isDisplayed());
        driver.quit();
    }

        @ Test
   public void negativeUserLoginTest() {
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://fasttrackit.org/selenium-test/");
       WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
       accountButton.click();

       WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
       loginLink.click();

       driver.findElement(By.cssSelector("#email")).sendKeys("matteozalau_royahoo.com");
       driver.findElement(By.cssSelector("#pass")).sendKeys("matteo");
       driver.findElement(By.cssSelector("#send2")).click();
       WebElement errorMsg = driver.findElement(By.xpath("//p[contains(text(),'* Required Fields')]"));
       Assert.assertTrue(errorMsg.isDisplayed());
       driver.quit();
   }
}





