package DAY12;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException{
        driver.get("https://www.akakce.com/");

        driver.findElement(By.cssSelector("[title=\"Broşürlerdeki Daha Ucuz Fiyatlar\"]")).click();

        // bir sayfa geriye gider
        driver.navigate().back();

        Thread.sleep(3000);

        //bir sayfa ileriye gider
        driver.navigate().forward();

        Thread.sleep(3000);

        driver.quit();
    }
}
