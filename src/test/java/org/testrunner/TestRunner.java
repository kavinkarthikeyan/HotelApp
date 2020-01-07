package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features\\Login.feature"},glue= {"org.stepdefinition"},monochrome=true,
dryRun=false)
public class TestRunner {

}
