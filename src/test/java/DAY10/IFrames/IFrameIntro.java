package DAY10.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class IFrameIntro {
    public static void main(String[] args) throws InterruptedException{


        /*
        IFrame e gitme yolları:
        1- index ile gitme ---> driver.switchTo().frame(x);   ----> x yerine index verilir.
        2- Name ile gitme ---> driver.switchTo().frame(x); ---> x yerine name attribute'u verilir
        3- Web Element ile gitme ---> driver.switchTo().frame(x); ---> x yerine web element verilir

         driver.switchTo().parentFrame(); --> parent frame e döner
         driver.switchTo().defaultContent(); --> ana html e döner
         */

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement iframe = driver.findElement(By.cssSelector("[name=\"SingleFrame\"]"));

        driver.switchTo().frame(iframe);

        driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("merhaba");

        //hata aldı ana sayfaya geri dönüyor

        driver.switchTo().parentFrame();

        driver.findElement(By.cssSelector("[href=\"WebTable.html\"]")).click();

        Thread.sleep(3000);

        driver.quit();

    }
}
