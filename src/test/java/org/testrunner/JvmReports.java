package org.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.opc.Configuration;

import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
public static void generateJvmReports(String json) {

	File f=new File("C:\\Users\\Kavin\\My Workspace\\AdactinHotel\\JVm report");

	net.masterthought.cucumber.Configuration con=new net.masterthought.cucumber.Configuration(f, "adaction hotel");
	con.addClassifications("Browser", "chrome");
	con.addClassifications("spriny", "11");
	
	List<String> jsonlist = new ArrayList<String>();
	jsonlist.add(json);
	
	ReportBuilder re=new ReportBuilder(jsonlist, con);
	re.generateReports();
	
}
}
