package Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports"},
        glue = "stepsDefinition",
        features = "src/test/resources/login.feature",
        dryRun = true,
        monochrome = true,
        strict = true)
public class RunCucumber{}
