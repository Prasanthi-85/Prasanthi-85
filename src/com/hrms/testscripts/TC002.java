package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC002 {

	public static void main(String[] args) throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication(null);
		
		obj.login();
		obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();

	}

}
