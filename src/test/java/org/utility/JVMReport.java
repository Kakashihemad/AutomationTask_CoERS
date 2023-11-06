package org.utility;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport extends Utilities {

	public static void generateJVMReport(String json) {
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JvmReports");
		Configuration con = new Configuration(loc, "Amazon");
		con.addClassifications("Browser Name", getProperty("browsername"));
		con.addClassifications("OS", "Window 11");
		con.addClassifications("Tester", "Gopal");
		con.addClassifications("Env", "QA");
		
		List<String> jsonFiles=new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r= new ReportBuilder(jsonFiles, con);
		r.generateReports();

	}

}
