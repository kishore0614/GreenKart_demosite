package com.pomgreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage01 {
	public static WebDriver driver;  //null driver
	
	public PomPage01(WebDriver driver2) {
		
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
	
	public WebElement getBeetroot() {
		return beetroot;
		
	}
	public WebElement getBrinjal() {
		return brinjal;
	}

	public WebElement getItems() {
		return items;
	}
	
	public WebElement getcheckout() {
		return checkout;
	}	
	
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[4]" )
	private WebElement beetroot;
	
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[6]" )
	private WebElement brinjal;
	
	@FindBy(xpath = "//img[@alt='Cart']" )
	private WebElement items;
	
	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']" )
	private WebElement checkout;
	
		
	
	

}
