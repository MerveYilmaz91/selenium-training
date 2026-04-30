package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement formLabel = driver.findElement(By.className("form-label"));

        String formLabelSting = formLabel.getText();

        System.out.println(formLabelSting);


        Thread.sleep(3000);

    }
}
