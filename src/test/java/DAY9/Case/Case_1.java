package DAY9.Case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class Case_1 {
    public static void main(String[] args) throws InterruptedException{
        /*
        1- https://www.ebay.com/ ' a git
        2- Sol üstteki "deals" e tıkla
        3- İlk ürüne git
        4- Ürün ismini konsola yazdır
         */

        driver.get("https://www.ebay.com/");

        driver.findElement(By.xpath("//span[text()='Deals']")).click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("span[class='ebayui-ellipsis-3']")).click();

        Thread.sleep(3000);

        WebElement urunAdi= driver.findElement(By.cssSelector("h1[class='x-item-title__mainTitle']"));

        System.out.println(urunAdi.getText());

        driver.quit();




    }
}
