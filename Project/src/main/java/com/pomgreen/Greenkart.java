package com.pomgreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Greenkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", 
				                 "C:\\Users\\DIVI\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		PomPage01 a = new PomPage01(driver);
		PomPage02 b = new PomPage02(driver);
		PomPage03 c = new PomPage03(driver);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		a.getBeetroot().click();
		Thread.sleep(2000);
		a.getBrinjal().click();
		Thread.sleep(2000);
		a.getItems().click();
		Thread.sleep(2000);
		a.getcheckout().click();
	    Thread.sleep(2000);
	    
	    b.getPromo().sendKeys("abcd");
	    b.getPromo().click();
	    Thread.sleep(2000);
	    b.getPlaceorder().click();
	    Thread.sleep(2000);
	    
	    Select s = new Select(c.getCountry());
	    s.selectByValue("India");
	    Thread.sleep(2000);
	    c.getCheckbox().click();
	    c.getProceed().click();
	    
	    Thread.sleep(2000);
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
		
		
		
		
		
		
	}
	

}
