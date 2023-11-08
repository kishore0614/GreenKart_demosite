package com.pomgreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {
	
	public static WebDriver driver;  //null driver
	
        public PomPage02(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
	
	public WebElement getPromo() {
		return promo;
		
	}
	public WebElement getPlaceorder() {
		return placeorder;
	}
	
	@FindBy(xpath = "//button[text()='Apply']" )
	private WebElement promo;
	
	@FindBy(xpath = "//button[text()='Place Order']" )
	private WebElement placeorder;
	
	


}
