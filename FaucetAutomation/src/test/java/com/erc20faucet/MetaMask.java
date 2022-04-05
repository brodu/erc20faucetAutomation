package com.erc20faucet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MetaMask extends Initializer {
    public static WebElement getStartedButton =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div/button"));
    public static WebElement importWalletButton =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/button"));
    public static WebElement noThanksButton =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div/div[5]/div[1]/footer/button[1]"));
    public static WebElement importInput =
            driver.findElement(By.id("mport-srp__srp-word-0"));
    public static WebElement newPassword =
            driver.findElement(By.id("password"));
    public static WebElement repeatPassword =
            driver.findElement(By.id("confirm-password"));
    public static WebElement submitButton =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div[2]/form/button"));
    public static WebElement allDoneButton =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/button"));
    public static WebElement networkDropdown =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[1]/div/div[2]/div[1]/div"));
    public static WebElement showHideNetworks =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[1]/div[3]/span/a"));
    public static WebElement showHideNetworksRadio =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[3]/div/div[2]/div[2]/div[2]/div[7]/div[2]/div/div"));
    public static WebElement goerliNetwork =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[2]/li[5]"));
    public static WebElement submitTransaction =
            driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[5]/div[4]/footer/button[2]"));
}
