package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/features/Signup.feature" }, glue = {
		"stepdefination" }, tags = "", plugin = { "html:target/cucumber-reports.html" })
public class CucumberRunner extends AbstractTestNGCucumberTests {

}

//features/Signup.feature

//"stepdefination" }, tags = "@iframe", plugin = { "pretty", "html:target/cucumber-reports.html" })