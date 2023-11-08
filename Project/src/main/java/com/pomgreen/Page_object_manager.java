package com.pomgreen;

import org.openqa.selenium.WebDriver;

public class Page_object_manager {
	
	public static WebDriver driver;
	
	private PomPage01 a;
	
	private PomPage02 b;
	
	private PomPage03 c;
	
	
	public Page_object_manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public PomPage01 getPomPage01() { 
		a = new PomPage01(driver);
		return a;
		
	}
	public PomPage02 getPomPage02() {
		b = new PomPage02(driver);
		return b;
		
	}
	public PomPage03 getPomPage03() {
		c = new PomPage03(driver);
		return c;
	}

	}

