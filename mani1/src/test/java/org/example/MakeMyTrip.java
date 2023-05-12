package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MakeMyTrip {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.makemytrip.com/");
        // maximize the window
        driver.manage().window().maximize();

        WebElement From = driver.findElement(By.xpath("//input[@id = 'fromCity']"));
        From.click();
        Select drpFrom = new Select(driver.findElement(By.xpath("//input[@Placeholder = 'From']")));
        drpFrom.selectByVisibleText("Mumbai, India");


    }

}
