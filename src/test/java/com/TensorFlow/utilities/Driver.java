package com.TensorFlow.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {

    private Driver(){}
    private static WebDriver driver;
    public static WebDriver get(){
        if (driver == null){
            String browser = ConfigurationReader.get("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }
            // The browser selection can be extend to Firefox, Safari, Edge, etc. By the same switch case.
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}

