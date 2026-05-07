package DAY7;

import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

public class _1_ActionDoubleClick {
    public static void main(String[] args) {

        // .doubleClick() elemente çift tıklamaya yarar.

        driver.get("https://demoqa.com/buttons");

        Thread.sleep(1000);

        new Actions(driver).doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();

    }
}

    }
}
