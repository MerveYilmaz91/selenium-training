package DAY8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class Alert_01_ {

    public static void main(String[] args) throws InterruptedException{
         /*
            switchTo().accept() ---> Alert onayı verir
            switchTo().dismiss() ---> Alerti red eder
            switchTo().sendKeys()  --->
            switchTo().getText() ---> Alertin textini verir
        */

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");

        Thread.sleep(2000);

        driver.findElement(By.id("confirm")).click();

        Thread.sleep(2000);

        driver.switchTo().alert().getText();


        Thread.sleep(2000);

        driver.quit();


    }
}
