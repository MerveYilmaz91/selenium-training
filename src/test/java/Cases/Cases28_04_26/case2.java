package Cases.Cases28_04_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class case2 {

    public static void main(String[] args) throws InterruptedException {
        /**
         * 1- https://demoqa.com/text-box 'a git
         * 2-Full Name
         * Email
         * Current Address
         * Permanent Address
         * alanlarını doldur
         * 3- Submit button a tıkla
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("merve yilmaz");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("merve@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("blabla");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("gksksksk");

        Thread.sleep(3000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        driver.quit();


    }
}
