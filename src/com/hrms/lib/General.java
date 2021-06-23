package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
	// Re-Usable fun:
	public void openApplication(String string) {
		System.setProperty("webdriver.chrome.driver", "D:\\Prasanthi Java\\Drivers\\ChromeDriver.exe");
	 driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Applicaion opened");//console
		Reporter.log("Application opened");//hml report
		Log.info("Application opened");//log file
	}
public void closeApplication() {
driver.close();
	System.out.println("Application closed");
	Log.info("Application closed");
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement((By) By.name(btn_login)).click();
	System.out.println("Login completed");	
	Log.info("login completed");
}
public void logout()throws Exception {

driver.findElement(By.id("welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	Log.info("Logout cmpleted");
	
}
public void addEmp() {
	System.out.println("Adding new employ");
	Log.info("Adding new employ");
}
public void delEmp() {
	System.out.println("Delete an employ");
	Log.info("Delete an employ");
	
}
	
	
}

