package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {

	
	
	public static void generateReports(String json) {

		
		File f = new File("target");
		
		Configuration co = new Configuration(f, "Sauce demo login and logout functionality testing");
		co.addClassifications("userStory", "15362");
		
		
		List<String>li = new LinkedList<String>();
		li.add(json);
		
		ReportBuilder report = new ReportBuilder(li, co);
		report.generateReports();
		
	}
	
	
	

	
	
	
	
	
	
}
