package DAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) {

        /*
         *
         * 1- soucedemo sitesine gidilecek
         * 2- kullanıcı girişi yapılacak
         * 3- Sauce Labs Fleece Jacket ürünü sepete eklenecek
         * 4- Sepet butonuna tıklanacak
         * 5- Sayfa url inin içerisinde cart var ise console a test başarılı yazdırılacak
         * */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement userNameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        WebElement loginButton = driver.findElement(By.id("login-button"));

        userNameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");

        loginButton.click();

        WebElement fleeceJacket = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));

        fleeceJacket.click();

        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));

        cartButton.click();

        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("cart")) {
            System.out.println("Test başarılı");
        }

    }
}
