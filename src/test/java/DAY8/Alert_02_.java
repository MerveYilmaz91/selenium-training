package DAY8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class Alert_02_ {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("promtButton")).click();

        Thread.sleep(1000);

        driver.switchTo().alert().sendKeys("merhaba");

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        Thread.sleep(2000);

        driver.quit();
    }
}
