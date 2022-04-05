package com.erc20faucet;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.erc20faucet",
        tags = "@all",
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)
public class RunnerTest {
}
