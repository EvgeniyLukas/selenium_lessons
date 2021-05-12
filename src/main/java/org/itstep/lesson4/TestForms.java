package org.itstep.lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestForms {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        boolean temp = false;
        webDriver.get("http://localhost:8080/");
        //List<WebElement> input = webDriver.findElements(By.tagName("input"));
        WebElement login = webDriver.findElement(By.name("Login"));
        login.sendKeys("admin");
        WebElement password = webDriver.findElement(By.name("Password"));
        password.sendKeys("password");
        if (temp)
            Thread.sleep(2000);
        password.submit();
        WebElement h1 = webDriver.findElement(By.tagName("h1"));
        String actual = h1.getText();
        String expected = "Hello Admin!!!";
        if (actual.equals(expected)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Тест не пройден");
            System.out.println("Ожидали: " + expected + ", получили: " + actual);
        }
        if (temp)
            Thread.sleep(2000);
        webDriver.quit();
        System.out.println("Ok");

    }
}
