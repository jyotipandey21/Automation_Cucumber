package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="./src/test/java/features/color.feature" , glue = { "Test" },
dryRun= false,
monochrome = true,
plugin = {"pretty","html:test-output"}
)
public class colors_Test {
}
