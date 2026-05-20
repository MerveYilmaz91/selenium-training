package DAY11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.js;

public class case1 {
    public static void main(String[] args) throws InterruptedException {
        /*
          1- https://www.selenium.dev/ sayfasına gidelim
  2- Aşağıdan Open Collective linkine tıklayın
  3- Açılan yeni sekmeden sayfanın en altında rastgele bir elemente tıklayın

         */

        driver.get("https://www.selenium.dev/");

        WebElement openCollective = driver.findElement(By.linkText("Open Collective"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", openCollective);

        Thread.sleep(3000);

        openCollective.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
