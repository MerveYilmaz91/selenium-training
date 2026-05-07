package Cases.Cases30_04_26;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class case2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1- https://www.amazon.com.tr/ ye git.
         * 2- Hamburger menüyü aç
         * 3- “Ayakkabı” sekmesine tıkla
         * 4- “Sneaker” sekmesine tıkla
         * 5- Bir ürün seç
         * 6- Ürün açıklamasını konsola yazdır
         */

        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(5000);

        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Ayakkabı")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Kadın Ayakkabı")).click();

        Thread.sleep(3000);


        driver.quit();

    }
}
