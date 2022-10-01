package testRunner;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		           features= {"FeatureFolder"},
                   glue= {"StepDefinition"},
                   dryRun=false
                  )

public class TestRunner {
	
	

}
