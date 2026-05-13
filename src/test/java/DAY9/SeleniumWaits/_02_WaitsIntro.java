package DAY9.SeleniumWaits;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;


public class _02_WaitsIntro {
    public static void main(String[] args) throws InterruptedException {

        /*
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         */

        driver.get("https://www.lcw.com/");

        driver.findElement(By.cssSelector("span.ins-web-opt-in-reminder-close-button")).click();

        driver.findElement(By.id("search-forminput-fieldsearch-input")).sendKeys("Siyah Tişört");
        driver.findElement(By.cssSelector("button.search-forminput-fieldbtn-search")).click();


        driver.findElement(By.cssSelector("a[href=\"/100-pamuk-regular-fit-basic-tisort-siyah-o-4827603\"]")).click();

        driver.findElement(By.cssSelector("button[data-label=\"L\"]")).click();
        driver.findElement(By.className("add-to-card")).click();

        System.out.println(driver.findElement(By.id("radix-4")).getText());

        driver.quit();

    }
}
