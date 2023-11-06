package org.stepdefinition;

import org.utility.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utilities {
	@Before
	public void setup() {
		openBrowser();
		implicitWait(20);
		driver.manage().deleteAllCookies();

	}
	
	@After
	public void tearDown(Scenario sc) {
		
		screenshot(sc.getName());
		sc.attach(screenshotAsBytes(), "image/png",sc.getName());
		closeBrowser();

	}

}
