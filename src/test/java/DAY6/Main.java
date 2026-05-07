package DAY6;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://tr.linkedin.com/");

        driver.findElement(By.className("nav__button-tertiary")).click();

        Thread.sleep(3000);

        driver.quit();


    }
}
