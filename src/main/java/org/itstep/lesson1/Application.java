package org.itstep.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "http://itstep.dp.ua";
        //открывает стрнице браузера
        webDriver.get(url);
         //вернет текущий URL
       String currentUrl = webDriver.getCurrentUrl();
       System.out.println(currentUrl);

        if(!currentUrl.equals(url)){
            System.err.println("URLs not valid!!!");
        }else {
            System.out.println("Test PASS");
        }

        System.out.println(webDriver.getTitle());
        String page = webDriver.getPageSource();
        //запись в файл
        BufferedWriter writer = new BufferedWriter(new PrintWriter("index.html"));
        //пишем данные в файл
        writer.write(page);
        writer.close();
        webDriver.close();

    }
}
