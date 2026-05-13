package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _5_ActionClassMovement {
    public static void main(String[] args) throws InterruptedException {

        /** actions.dragAndDrop(WebElement x1, WebElement x2)    ----> x1 elementi x2 elementinin üzerine bırakır
        actions.clickAndHold(WebElement x1) ---> x1 elementine basılı tutar
        actions.relase() ---> x1 elementine basılı tutar

         */

        driver.get("https://demoqa.com/dragabble");

        Thread.sleep(3000);

        driver.findElement(By.id("draggableExample-tab-cursorStyle")).click();

        Thread.sleep(3000);

        WebElement cursorCenterElement = driver.findElement(By.id("cursorCenter"));

        WebElement cursorTopLeftElement = driver.findElement(By.id("cursorTopLeft"));

        WebElement cursorBottomElement = driver.findElement(By.id("cursorBottom"));

        Actions actions = new Actions(driver);

        Action putMiddle = actions.dragAndDropBy(cursorBottomElement,500,0).build();
        putMiddle.perform();

        Action firstElementToMiddleElement = actions.dragAndDrop(cursorCenterElement,cursorTopLeftElement).build();
        firstElementToMiddleElement.perform();

        Action thirdElementToMiddleElement = actions.dragAndDrop(cursorBottomElement,cursorTopLeftElement).build();
        thirdElementToMiddleElement.perform();

        Thread.sleep(4000);

        driver.quit();









    }
}
