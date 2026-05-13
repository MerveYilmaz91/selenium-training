package DAY8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _6_ActionClassScroll {
    public static void main(String[] args) throws InterruptedException{
        /**

        1- actions.scrollToElement()  ->    x1 elementine kadar sayfayı scroll eder
         2-actions.scrollByAmount()   -> x yada y ekseninde scroll yapar
         */


        driver.get("https://www.selenium.dev/selenium/web/alerts.html");

        WebElement markalarKesfetIMG = driver.findElement
                (By.id("open-window-with-onclose-alert"));

        new Actions(driver).scrollToElement(markalarKesfetIMG).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
