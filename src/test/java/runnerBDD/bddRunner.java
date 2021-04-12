package runnerBDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="/Users/mohammadedrees/Desktop/TekCapstoneProject/BddCapStoneProjectTek/src/test/resources/Features/TekBddRetailPage.feature", 
		glue = {"stepDefinetions"}, 
		//tags = {""}, 
		dryRun = false, 
		monochrome = true, 
		//strict =false, 
		format = {"pretty", 		        
				"html:target/cucumber-reports/cucumber-pretty",
		        "json:target/cucumber-reports/CucumberTestReport.json",
		        "rerun:target/cucumber-reports/rerun.txt"},
		plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)
public class bddRunner {

}

// This is Commit
// Commit for testing and check
