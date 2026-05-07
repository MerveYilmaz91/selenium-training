package Cases.Cases28_04_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1- soucedemo sitesine gidilecek
         * 2- kullanıcı girişi yapılacak
         * 3- Sauce Labs Fleece Jacket ürünü sepete eklenecek
         * 4- Sepet butonuna tıklanacak
         * 5- Sayfa url inin içerisinde cart var ise console a test başarılı yazdırılacak
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement jacketAddButton = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        jacketAddButton.click();

        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("cart")) {
            System.out.println("Test başarılı");
        } else {
            System.out.println("Test başarısız");
        }

        driver.quit();







    }
}
