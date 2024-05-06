package automation;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", 
		glue = {
		"automation.stepDefinitions",
		"automation.hooks"
		}, 
		monochrome = true, 
		dryRun = false,
		tags = ("@featureTag")
)
@FixMethodOrder(MethodSorters.DEFAULT)
public class Runner {
	
	
}
