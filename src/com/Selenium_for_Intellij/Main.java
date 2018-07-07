package com.Selenium_for_Intellij;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static WebDriver driver;
    private static String domain = "http://frontoffice.pre.redpoints.com/";

    private static void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/patriciamateos/Documents/Selenium/drivers/chromedriver");
        Main.driver = new ChromeDriver();
    }

    private static void goToPage(String url) {
        Main.driver.get(Main.domain + "login");
    }

    public static void main(String[] args) {
        Main.init();
        Main.goToPage("http://frontoffice.pre.redpoints.com/login");
    }
}
