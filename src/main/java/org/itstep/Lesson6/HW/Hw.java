package org.itstep.Lesson6.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        WebElement searchBox = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchBox.sendKeys("сиреневенький");
        searchBox.sendKeys(Keys.ENTER);


        WebElement results = webDriver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        System.out.println(results.getText() + "result");
        String actual = results.getText();
        String expected = "примерно 27 700";
        if (actual.equals(expected)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Тест не пройден");
            System.out.println("Ожидали: " + expected + ", получили: " + actual);
        }

        Thread.sleep(2000);
        webDriver.quit();


    }
}
