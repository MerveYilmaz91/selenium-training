package DAY9.Case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static Utility.BaseDriver.driver;

public class Case_2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- https://www.ebay.com/ ' a git
        2- "Sports" ' a hover yap
        3- "Cycling" e tıkla
        4- Soldaki bardan "Bicycle Accessories" e tıkla
        5- Sayfadaki ürün sayısını konsola yazdıralım
         */


        driver.get("https://www.ebay.com/");

        WebElement sports = driver.findElement(By.xpath("//span[text()='Sports']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(sports).perform();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Cycling']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Bicycle Accessories']")).click();

        Thread.sleep(3000);

        List<WebElement> products = driver.findElements(By.xpath("//li[contains(@class,'s-item')]"));

        System.out.println(products.size());

        driver.quit();






    }
}
