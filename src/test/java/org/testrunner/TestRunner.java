package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features\\Login.feature"},glue= {"org.stepdefinition"},monochrome=true,
dryRun=false,plugin= {"html:C:\\Users\\Kavin\\My Workspace\\AdactinHotel\\Reports","json:C:\\Users\\Kavin\\My Workspace\\AdactinHotel\\Reports\\out.json"})
public class TestRunner {
@AfterClass
public static void reports() {
JvmReports.generateJvmReports("C:\\Users\\Kavin\\My Workspace\\AdactinHotel\\Reports\\out.json");
	
	
}
}
 