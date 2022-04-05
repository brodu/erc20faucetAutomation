package com.erc20faucet;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.util.ArrayList;

public class Steps extends Initializer {

    @Before
    public void beforeHook() {
        options = new ChromeOptions();
        options.addExtensions(new File("src/main/resources/MetaMask.crx"));
        DesiredCapabilities capabilities = new DesiredCapabilities ();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
    }

    @After
    public void afterHook() {
        driver.quit();
    }

    @Given("I login")
    public void login() {
        driver.get("https://erc20faucet.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://erc20faucet.com/");
    }

    @When("I change network to Goerli")
    public void i_change_network_to_Goerli() throws InterruptedException {

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html");
  
        if (MetaMask.getStartedButton.isDisplayed()) {
            MetaMask.getStartedButton.click();
            MetaMask.importWalletButton.click();
            MetaMask.noThanksButton.click();
        }
        ArrayList <String> recoveryPhrase = new ArrayList<>(12);

        for (int i = 0; i < 12; i++){
            String word = Integer.toString(i);
            recoveryPhrase.add(word);
            MetaMask.importInput.sendKeys(word, "TAB");
        }
        MetaMask.newPassword.sendKeys("12345678a");
        MetaMask.repeatPassword.sendKeys("12345678a");
        MetaMask.submitButton.click();
        MetaMask.allDoneButton.click();
        MetaMask.networkDropdown.click();
        MetaMask.showHideNetworks.click();
        MetaMask.showHideNetworksRadio.click();
        MetaMask.networkDropdown.click();
        MetaMask.goerliNetwork.click();
        driver.get("https://erc20faucet.com/");
    }

    @When("I connect MetaMask")
    public void i_connect_MetaMask() throws Throwable {
        Faucet.address.sendKeys("0xBCe8DF551CA1854979722a3f9A19Be0d6596dE65");
        Faucet.connectButton.click();
        Faucet.metaMaskOption.click();
        Faucet.continueButton.click();
        Faucet.continueButton.click();
        Faucet.mintFreeToken.click();
        throw new PendingException();
    }

    @When("^I click Mint Free Tockens button$")
    public void i_click_Mint_Free_Tockens_button() throws Throwable {
        Faucet.mintFreeToken.click();
        throw new PendingException();
    }

    @When("^I approve transaction$")
    public void i_approve_transaction() throws Throwable {
        MetaMask.submitTransaction.click();
        throw new PendingException();
    }
}
