package DAY9.SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utility.BaseDriver.driver;

public class _03_ImplicitlyWaitExample {

    public static void main(String[] args) {

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");


        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn2")).click();

        System.out.println(driver.findElement(By.id("txt1")).getAttribute("placeholder"));


        System.out.println(driver.findElement(By.id("txt2")).getAttribute("placeholder"));

        driver.quit();

    }


}
