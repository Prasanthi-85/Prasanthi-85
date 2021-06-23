package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC001 {

	public static void main(String[] args) throws Exception {
		// Test case steps
		DOMConfigurator.configure("log4j.xml");
		
		General obj=new General();
		obj.openApplication("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		obj.login();
		obj.logout();
		obj.closeApplication();

	}
		
	}


