package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {
    public static void main(String[] args ) throws InterruptedException {
        /**
         * 1- https://demoqa.com/text-box 'a git
         * 2-Full Name
         * Email
         * Current Address
         * Permanent Address alanlarını doldur
         *3- Submit button a tıkla
         **/

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        Thread.sleep(3000);

        WebElement fullname = driver.findElement(By.id("userName"));
        fullname.sendKeys("Merve Yılmaz");

        Thread.sleep(3000);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("merve@test.com");

        Thread.sleep(3000);

        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys("istanbul");

        Thread.sleep(3000);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("fethiye");

        Thread.sleep(3000);

        WebElement submitButton =driver.findElement(By.id("submit"));
        submitButton.click();

        Thread.sleep(3000);

        driver.quit();



    }

}
