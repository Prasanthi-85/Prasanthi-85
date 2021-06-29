package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.lib.*;

public class TC002 {

	public static void main(String[] args) throws Exception {
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();

	}

}
