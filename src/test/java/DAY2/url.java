package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {
    public static void main(String[] args) {

        /**
         * 1- https://www.google.com.tr/ adresine gidilecek
         * 2- sayfa url i alınacak
         * 3- sayfa url i ayıklanacak sadece google.com konsola a yazılacak
         **/

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/"); // siteye git

        String url = driver.getCurrentUrl();   // bulunduğun URL'yi al

        System.out.println(url.substring(url.indexOf(".") +1));

        driver.quit();
    }
}