package Cases.Cases29_04_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class case2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1- https://www.saucedemo.com/ sayfasına gidilecek
         * 2- giriş yapılacak
         * 3- 4 adet rastgele ürün sepete eklenecek
         * 4- sepet sayfasına gidilecek
         * 5- sepetteki 4 ürünün isimleri konsola yazdırılacak
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement jacketAddButton = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        jacketAddButton.click();

        WebElement backpackButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpackButton.click();

        WebElement bikelightButton = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        bikelightButton.click();

        WebElement onesieButton = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        onesieButton.click();

        WebElement cardLink = driver.findElement(By.className("shopping-cart-link"));
        Thread.sleep(1000);
        cardLink.click();

        List<WebElement> urunler = driver.findElements(By.className("inventory_item_name"));

        for (WebElement urun : urunler) {
            System.out.println(urun.getText());
        }





    }
}
