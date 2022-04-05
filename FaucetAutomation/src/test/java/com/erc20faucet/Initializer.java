package com.erc20faucet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Initializer {
    public static ChromeDriver driver;
    public ChromeOptions options;
    public final String password = new String("12345678a");

    public void waitUntilVisible(WebElement element, int time) throws RuntimeException, InterruptedException {
        while (element.isDisplayed() != true){
            Thread.sleep(time);
        }
    }

}
