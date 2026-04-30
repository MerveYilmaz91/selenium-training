package DAY1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
    public static void main(String[] args) throws InterruptedException {
        String abc = "merhaba dünya";

        WebDriver driver = new ChromeDriver();
        WebDriver driver2 = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver2.get("https://www.google.com/");

        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
