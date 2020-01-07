package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.HelperClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends HelperClass {

	@Before
	public void beforeExecution() {
		
		BrowserLaunch();
		driver.manage().window().maximize();
		Launchurl("https://adactin.com/HotelApp/");
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);

	}

	@After
	public void afterExecution() {
		driver.manage().deleteAllCookies();
		driver.quit();

	}
}
