package DAY12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utility.BaseDriver.driver;
import static Utility.SpecialFunctions.scrollAndClick;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- https://www.akakce.com/ 'a git
        2- "Yeşil Işık" a tıkla
        3- Sayfadaki sonuncu ürüne tıkla
        4- Ürün ismini konsola yazdır
         */

        driver.get("https://www.akakce.com/");

        driver.findElement(By.cssSelector("[title=\"Broşürlerdeki Daha Ucuz Fiyatlar\"]")).click();

        List<WebElement> productTitles = driver.findElements(By.cssSelector(".pw_v8"));

        WebElement lastProduct = productTitles.get(productTitles.size()-1);

        scrollAndClick(lastProduct);

        System.out.println(driver.findElement(By.tagName("h1")).getText());

        Thread.sleep(3000);

        driver.quit();



    }
}
