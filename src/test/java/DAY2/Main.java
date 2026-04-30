package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoga.com/links");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.quit();  // sadece var olan sekmeyi kapatır.

    }
}
