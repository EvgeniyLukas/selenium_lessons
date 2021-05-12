package org.itstep.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Find {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        String url = "C:\\Users\\Evgeniy\\IdeaProjects\\SeleniumQA03\\src\\main\\resources\\WebElement.html";

        webDriver.get(url);

        //WebElement [] webElements = {h2, h1}
        List<WebElement> h2 = webDriver.findElements(By.tagName("h2"));
        for (int i = 0; i < h2.size(); i++) {   //h2.length
            WebElement webElement = h2.get(i);  //h2[i]
            System.out.println("Text: " + webElement.getText());
            System.out.println("TagName: " + webElement.getTagName());
            System.out.println("Size: " + webElement.getSize());
            System.out.println("Location: " + webElement.getLocation());
            System.out.println("IsDisplayed: " + webElement.isDisplayed());
            System.out.println();
        }

        webDriver.quit();

        System.out.println("Test ok");
    }
}
