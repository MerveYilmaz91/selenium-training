package DAY10.CASE;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.wait;

public class Case2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- https://seleniumpractise.blogspot.com/2025/08/loader-demo.html sayfasına git
        2- Start with fast loader a tıkla
        3- name, email alanlarını doldur ve gönder
        4- "Thank you, we will get back to you." yazısını konsola yazdır
         */

        driver.get("https://seleniumpractise.blogspot.com/2025/08/loader-demo.html");

        driver.findElement(By.id("la-start-fast")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("la-name")));

        driver.findElement(By.id("la-name")).sendKeys("merve");

        driver.findElement(By.id("la-email")).sendKeys("merve@gmail.com");

        driver.findElement(By.id("la-submit")).click();

        System.out.println(driver.findElement(By.id("la-thankyou")).getText());

        driver.quit();



    }
}
