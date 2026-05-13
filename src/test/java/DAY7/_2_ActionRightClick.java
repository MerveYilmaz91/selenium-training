package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _2_ActionRightClick {
    public static void main(String[] args) throws InterruptedException {

        //contaxtClick -> elemente sağ tıklamaya yarar

        driver.get("https://demoqa.com/buttons");

        Thread.sleep(3000);

        new Actions(driver).contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
    }
}
