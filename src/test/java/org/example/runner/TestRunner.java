package org.example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/tests",
        glue = {"org.example.steps","org.example.config"},
        tags = "@test",
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumer.json"},
        monochrome = true)

public class TestRunner {}
