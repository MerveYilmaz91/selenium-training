package DAY10.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class Example1 {
    public static void main(String[] args) throws InterruptedException{
        /*
        1- https://practice.expandtesting.com/iframe sayfasına git
        2- Internal IFrame: Email Subscription alanını doldur ve gönder
        3- You are now subscribed! yazısını konsola yazdır
         */

        driver.get("https://practice.expandtesting.com/iframe");

        // Önce iframe'e gir
        WebElement iframe = driver.findElement(By.id("email-subscribe"));
        driver.switchTo().frame(iframe);

        // Sonra iframe içindeki input'u bul ve yazı yazdır
        driver.findElement(By.cssSelector("[class=\"form-control\"]")).sendKeys("blbla@gmail.com");

        Thread.sleep(5000);

        //tıkla
        driver.findElement(By.id("btn-subscribe")).click();

        Thread.sleep(3000);

        // Yazıyı al ve ekrana yazdır
        String message = driver.findElement(By.id("success-message")).getText();
        System.out.println(message);

        // İşin bitince ana sayfaya dön
        driver.switchTo().defaultContent();

        Thread.sleep(3000);

        driver.quit();


    }
}
