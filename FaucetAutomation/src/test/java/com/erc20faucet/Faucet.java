package com.erc20faucet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Faucet extends Initializer {
    public static WebElement address =
            driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/div/div/div/div/div[1]/div/input"));
    public static WebElement connectButton =
            driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/div/div/div/div/div[3]/button"));
    public static WebElement metaMaskOption =
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div/div[1]/button"));
    public static WebElement continueButton =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[3]/div[2]/button[2]"));
    public static WebElement mintFreeToken =
            driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/div/div/div/div/div[3]/button"));
}
