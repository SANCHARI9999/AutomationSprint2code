package testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/feature"	
,glue= {"stepDefinition","hook"}
,tags= {"@edit_functionality_taking_previous_dates"}

,plugin= {"pretty","html:target/cucumber-pretty","junit:target/report.xml","json:target/jsonreport.json"}
)	



public class testRunner {

}
