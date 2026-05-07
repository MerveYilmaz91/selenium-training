package Cases.Cases30_04_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import static Utility.BaseDriver.driver;

public class case1 {
    public static void main(String[] args) throws InterruptedException {



        /**
         *1- https://www.lcw.com/ sayfasına git
         * 2- arama çubuğuna "siyah tişört" yaz ve ara
         * 3- ilk ürüne tıkla
         * 4- ürünün bedenini seç ve sepete ekle
         * 5- sepette çıkan "Ürün Sepete Eklendi" yazısını konsola yazdır
         */

        driver.get("https://www.lcw.com/");

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("span.ins-web-opt-in-reminder-close-button")).click();

        driver.findElement(By.id("search-form__input-field__search-input")).sendKeys("Siyah Tişört");
        driver.findElement(By.cssSelector("button.search-form__input-field__btn-search")).click();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("a[href=\"/100-pamuk-regular-fit-basic-tisort-siyah-o-4827603\"]")).click();

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("button[data-label=\"L\"]")).click();
        driver.findElement(By.className("add-to-card")).click();

        Thread.sleep(2000);

        System.out.println(driver.findElement(By.id("radix-4")).getText());

        System.out.println(driver.findElement(By.id("radix-4")).getCssValue("font-size"));


        driver.quit();

    }
}