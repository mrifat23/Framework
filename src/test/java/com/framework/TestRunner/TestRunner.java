package com.framework.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.framework.Util.TestBase;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

	  

	@CucumberOptions(features = {"src/test/resources/Features"} , 
	plugin = {"json:target/cucumber.json"},
	glue = "StepDefinition1", 
	tags= {"@Test"})
	
	

	public class TestRunner extends AbstractTestNGCucumberTests {

		@BeforeTest
		public void launchAppURL() {
		TestBase launch = new TestBase();
		launch.initz();
		
		
			
	
		}
		@AfterTest
		public void closeAppURL() {
		TestBase done = new TestBase();
		
			done.driver.quit();
			
			
		}
	}

	

