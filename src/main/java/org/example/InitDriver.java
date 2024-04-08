package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitDriver {
    static WebDriver driver;

    public static void driverInit() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
//hello

    }
}