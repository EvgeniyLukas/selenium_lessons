package org.itstep.lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        boolean start = true;


        String[] urls = {
                "http://www.google.com.ua/",
                "http://itstep.dp.ua/",
                "http://ukr.net/",
        };

        for (int i = 0; i < urls.length; i++) {
            if (start) {
                webDriver.navigate().to(urls[i]);
                System.out.println(webDriver.getCurrentUrl() + " page opened");

                // System.out.println("Title = " + webDriver.getTitle());
            }
        }

        for (int i = urls.length - 1; i > 0; i--) {
            webDriver.navigate().back();
            System.out.println("back to " + urls[i - 1]);
        }


        if (start)
            Thread.sleep(1000);

        webDriver.navigate().forward();
        System.out.println("forward to ItStep");


        if (start)
            Thread.sleep(1000);

        webDriver.quit();

        System.out.println("Ok");


    }
}
