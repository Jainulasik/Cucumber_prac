package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\feature\\Saucedemo.feature",
glue = "org.stepdefinition",dryRun = false,monochrome = false,
snippets = io.cucumber.junit.CucumberOptions.SnippetType.UNDERSCORE,
plugin = {
		"html:target\\Htmlreport",
		"json:target\\Jsonreport.json",
		"junit:target\\XmlReport.xml"


})

public class TestRunner {


	@AfterClass
	public static void after() {
    ReportingClass.generateReports("target\\Jsonreport.json");
    
	}
}
