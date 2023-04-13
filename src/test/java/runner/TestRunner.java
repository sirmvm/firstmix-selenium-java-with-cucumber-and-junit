package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	features = "src/test/java/features",
	glue = "seleniumCucumber",
	monochrome = true
	
)
public class TestRunner {

}
