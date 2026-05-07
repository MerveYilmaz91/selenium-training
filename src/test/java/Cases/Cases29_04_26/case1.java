package Cases.Cases29_04_26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class case1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1- https://demoqa.com/automation-practice-form
         * 2- tüm inputlar doldurlacak
         * 3- submit edilecek
         * 4- Thanks for submitting the form elementi alınıp konsola texti yazdırılacak
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("merve");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Yılmaz");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("merve@gmail.com");

        WebElement gender = driver.findElement(By.id("gender-radio-2"));
        gender.click();

        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("0555555555");

        // burada date of birth kısmı olacak ?????


        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Maths");
        subjects.sendKeys(Keys.ENTER);


        WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-2"));
        hobbies.click();


        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Istanbul / Kartal");


        Thread.sleep(2000);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        Thread.sleep(2000);


        WebElement resultText = driver.findElement(By.id("example-modal-sizes-title-lg"));


        System.out.println(resultText.getText());

        driver.quit();



    }
}






