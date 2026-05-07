package DAY6;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class Main2 {
    public static void main(String[] args) {
        driver.get("https://www.linkedin.com/home");

        driver.findElement(By.cssSelector("button[aria-label=\"Sonraki Slayt\"]")).click();

        driver.quit();

    }
}
