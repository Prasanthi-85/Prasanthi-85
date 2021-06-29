package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import com.hrms.utility.Log;

public class General extends Global {
	// Re-Usable fun:
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Prasanthi Java\\Drivers\\ChromeDriver.exe");
	 driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Applicaion opened");//console
	}
public void closeApplication() {
driver.quit();
	System.out.println("Application closed");
}
public void login() throws Exception {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement((By) By.name(btn_login)).click();
	Thread.sleep(3000);
	System.out.println("Login completed");	
}
public void logout()throws Exception {

driver.findElement(By.id("welcome")).click();
	driver.findElement(By.cssSelector("#welcome-menu > ul > li:nth-child(3) > a")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	Log.info("Logout cmpleted");
	
}
public void addEmp() {
	System.out.println("Adding new employ");
}
public void delEmp() {
	System.out.println("Delete an employ");
	
	
}
	
	
}

