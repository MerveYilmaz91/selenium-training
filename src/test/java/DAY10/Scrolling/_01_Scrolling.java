package DAY10.Scrolling;

import org.openqa.selenium.JavascriptExecutor;

import static Utility.BaseDriver.driver;

public class _01_Scrolling {
    public static void main(String[] args) throws InterruptedException {
         /*
            window.scrollTo(x, y) ---> x ve y ekseninde ekranı kaydırır yapar
            window.scrollTo(0, document.body.scrollHeight) --> sayfanın en altına kaydırır
            window.scrollTo(0, -document.body.scrollHeight) --> sayfanın en üstüne kaydırır

            js.executeScript("arguments[0].scrollIntoView(true)", element);  ---> elemente kadar kaydırır
            true ---> element sayfanın yukarısında kalır
            false ---> element sayfanın altında kalır
     */

        driver.get("https://practice.expandtesting.com/iframe");

        //driver ımda çalışan bir js komut değişkeni

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(4000);

        driver.quit();



    }
}
