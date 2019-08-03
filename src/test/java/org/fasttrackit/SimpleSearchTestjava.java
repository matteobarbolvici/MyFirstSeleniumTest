package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SimpleSearchTestjava {

    @Test
    public void simpleSearchWithOneKeyword() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.id("search")).sendKeys("vasc" + Keys.ENTER);



    }


    @Test
    public void SearchIcon(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.id("search")).sendKeys( "#search_mini_form > div.input-box > button ");





    }

}