package DAY11;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

import static Utility.BaseDriver.driver;

public class _01_WindowIntro {
    public static void main(String[] args) throws InterruptedException {

        /*
        1- https://www.ebay.com/ a git
        2- Herhangi bir ürüne tıkla

         /*
        driver.getWindowHandle() ---> içinde bulunduğumuz windowun id sini verir
        driver.getWindowHandles() ---> tüm vindowların id sini bir Set olarak döndürür


        driver.switchToWindow(x) ----> x yerine window id si gelir
        driver.switchTo().newWindow(WindowType.TAB); ---> yeni sekme açar ve switch yapar
         */


        driver.get("https://www.ebay.com/");

        driver.findElement(By.id("item-1")).click();

        Iterator<String> iterator = driver.getWindowHandles().iterator();   //Bu listedeki sekmeleri TEK TEK dolaşacağım.

        String firstWindow = iterator.next();  //İlk pencereyi alıyor
        String secondWindow = iterator.next();  // İkinci pencereyi alıyor

        driver.switchTo().window(secondWindow); //Artık yeni sekmede çalış.Yani Selenium artık yeni açılan ürünü kontrol ediyor.

        System.out.println(driver.findElement(By.cssSelector(".x-item-title__mainTitle")).getText()); //Ürün adı yazdırıyor
        driver.findElement(By.id("binBtn_btn_1")).click();

        driver.switchTo().window(firstWindow); //Sonra eski sekmeye dönüyor
        driver.get("https://www.lcw.com/");

        Thread.sleep(3000);

        driver.quit();

        /*1. Siteye git
2.           Yeni sekme aç
3.           Yeni sekmenin ID’sini bul
4.           O sekmeye geç
5.           İşini yap
6.           Geri dön

         */

    }
}
