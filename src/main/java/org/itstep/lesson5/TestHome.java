package org.itstep.lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestHome {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        String str = "#content > article > div > p:nth-child(4) > a:nth-child(2)";

        webDriver.get("https://itstep.dp.ua/contacts");

        webDriver.manage().window().fullscreen();

        String[] form = {"Jack", "8800773535", "www@apple.com"};
        for (int i = 1; i < 4; i++) {
            WebElement element = webDriver.findElement(
                    By.cssSelector("#form_construct_main > div.form__block > div:nth-child(" + i + ") > input"));
            System.out.println(element.getAttribute("placeholder"));
            element.sendKeys(form[i - 1]);
            Thread.sleep(3000);
        }

        WebElement checkBox = webDriver.findElement(
                By.cssSelector("#form_construct_main > " +
                        "div.gdpr-policy.gdpr-policy--form-contact >" +
                        " label > span.gdpr-policy__checkbox-icon.checkbox-policy"));
        checkBox.click();
        if(!checkBox.isEnabled()){
            checkBox.click();
        }else {
            webDriver.findElement(By.cssSelector("#form_construct_main > button")).click();
            Thread.sleep(5000);
        }



        webDriver.quit();
        System.out.println("Ok");
    }
}
