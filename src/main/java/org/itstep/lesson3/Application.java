package org.itstep.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Application {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        String url = "C:\\Users\\Evgeniy\\IdeaProjects\\SeleniumQA03\\src\\main\\resources\\WebElement.html";
        String url1 = "file:///C:/Users/Evgeniy/IdeaProjects/SeleniumQA03/src/main/resources/WebElement.html";


        webDriver.get(url);

        System.out.println("Title = " + webDriver.getTitle());

        WebElement h2 = webDriver.findElement(By.tagName("h2"));

        System.out.println("Text: " + h2.getText());
        System.out.println("TagName: " + h2.getTagName());
        System.out.println("Size" + h2.getSize());
        System.out.println("Location" + h2.getLocation());


        //WebElement google = webDriver.findElement(By.linkText("Google"));
        WebElement google = webDriver.findElement(By.partialLinkText("ogle"));
        google.click();
        Thread.sleep(1000);
        String currentUrl = webDriver.getCurrentUrl();
        String actual = "https://www.google.com/";

        if(!currentUrl.equalsIgnoreCase(actual)){
            System.out.println("Тест не пройден, не совпали ссылки");
            System.out.println("Ожидали: " + actual);
            System.out.println("Получили: " + currentUrl);
        }else {
            System.out.println("Pass");
        }

        webDriver.quit();

        System.out.println("ok");
    }
}
