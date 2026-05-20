package DAY12;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import static Utility.BaseDriver.driver;

public class GetScreetShot {
    public static void main(String[] args) throws InterruptedException, IOException {

        /*
        1- https://www.akakce.com/ 'a git
        2- "airpods 3" araması yap
        3- Ekran görüntüsü al

         */

        driver.get("https://www.akakce.com/");

        driver.findElement(By.cssSelector("[placeholder=\"Neyi ucuza almak istersin?\"]")).
                sendKeys("Air pods pro 3");

        driver.findElement(By.cssSelector("[title=\"Ara\"]")).click();

        Thread.sleep(3000);

        //screenshot almak için ezber kod!!!

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("target/screenshots/akakceScreenshotairpods.png"));

        Thread.sleep(3000);

        driver.quit();



    }
}
