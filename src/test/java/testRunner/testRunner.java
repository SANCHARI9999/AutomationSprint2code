package testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/feature"	
,glue= {"stepDefinition","hook"}
,tags= {"@trash_functionality_in_posts_section"}

,plugin= {"pretty","html:target/cucumber-pretty","junit:target/report.xml","json:target/jsonreport.json"}
)	



public class testRunner {

}
