package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.lib.*;

public class TC001 {

	public static void main(String[] args) throws Exception {
		// Test case steps
		
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();

	}
		
	}


