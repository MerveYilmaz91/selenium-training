package DAY6;

import org.openqa.selenium.By;

import static Utility.BaseDriver.driver;

public class webElementMethods {
    public static void main(String[] args) {
        /**
         * 1-isDisplayed()  --> web elementin sayfada görünürlülüğünün verisini verir.
         * 2-isEnable()   --> Web elementin kullanılabilir olup olmadığını true/false şeklinde döndürür
         * 3-isSelected()
         **/

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        System.out.println(driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input")).isEnabled());

        driver.quit();





    }
}
