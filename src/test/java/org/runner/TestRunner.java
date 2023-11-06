package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition", dryRun=false, stepNotifications=true,
plugin= {"html:src\\test\\resources\\Reports\\HtmlReport\\htmlreport.html",
		 "json:src\\test\\resources\\Reports\\JsonReport\\report.json",
		 "junit:src\\test\\resources\\Reports\\JunitReport\\junitreport.xml"})
public class TestRunner {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\JsonReport\\report.json");
		System.out.println("Report Generated Successfull");
		

	}

}
