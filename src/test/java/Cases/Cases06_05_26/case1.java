package Cases.Cases06_05_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class case1 {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.calculatorsoup.com/calculators/statistics/random-number-generator-1-100.php");

        Thread.sleep(2000);

        // 1. sayı
        driver.findElement(By.id("actionCalculate")).click();
        Thread.sleep(2000);

        String fullText1 = driver.findElement(By.id("calculatorAnswer")).getText();
        String[] lines1 = fullText1.split("\n");
        int num1 = Integer.parseInt(lines1[1].trim());

        System.out.println("1. sayı: " + num1);


        // 2. sayı
        driver.findElement(By.id("actionCalculate")).click();
        Thread.sleep(2000);

        String fullText2 = driver.findElement(By.id("calculatorAnswer")).getText();
        String[] lines2 = fullText2.split("\n");
        int num2 = Integer.parseInt(lines2[1].trim());

        System.out.println("2. sayı: " + num2);


        // Toplama
        int total = num1 + num2;
        System.out.println("İlk toplam: " + total);


        // 3. sayı çıkarma
        driver.findElement(By.id("actionCalculate")).click();
        Thread.sleep(2000);

        String fullText3 = driver.findElement(By.id("calculatorAnswer")).getText();
        String[] lines3 = fullText3.split("\n");
        int num3 = Integer.parseInt(lines3[1].trim());

        System.out.println("Çıkarılan sayı: " + num3);

        total = total - num3;

        System.out.println("Çıkarmadan sonraki toplam: " + total);


        // 100'den küçükse toplamaya devam et
        while (total < 100) {

            driver.findElement(By.id("actionCalculate")).click();
            Thread.sleep(2000);

            String extraText = driver.findElement(By.id("calculatorAnswer")).getText();
            String[] extraLines = extraText.split("\n");
            int extraNum = Integer.parseInt(extraLines[1].trim());

            System.out.println("Eklenen sayı: " + extraNum);

            total = total + extraNum;

            System.out.println("Yeni toplam: " + total);
        }


        System.out.println("TEST BİTTİ. Son toplam: " + total);

        Thread.sleep(2000);
        driver.quit();

    }
}