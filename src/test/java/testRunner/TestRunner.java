package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/",
        tags = "",
        glue={"stepDefinitions"},
        plugin = "pretty",
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
