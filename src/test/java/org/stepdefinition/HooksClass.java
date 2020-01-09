package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.HelperClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends HelperClass {

	@Before(order=-1)                 //before execution of each scenario
	public void beforeExecution2() {
		System.out.println("Browser is launching");
		BrowserLaunch();
		Launchurl("https://adactin.com/HotelApp/");

		
	}
	
	@Before(order=2)
	
	public void beofreExecution1() {
		System.out.println("Window maximizing and wait is applied");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);


	}
	


	@After
	public void afterExecution() {
		driver.manage().deleteAllCookies();
		driver.quit();

	}
}
