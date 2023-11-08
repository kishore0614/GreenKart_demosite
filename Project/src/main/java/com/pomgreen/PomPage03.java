package com.pomgreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {
	public static WebDriver driver;  //null driver
	
      public PomPage03(WebDriver driver2) {
	  this.driver=driver2;
      PageFactory.initElements(driver2, this);   
  }  
        public WebElement getCountry() {
    		return country;
    		
    	}
    	public WebElement getCheckbox() {
    		return checkbox;
    		
    	}
    	 public WebElement getProceed() {
     		return proceed;
     		
    	}

    	@FindBy(xpath = "//select[@style='width: 200px;']" )
    	private WebElement country;

    	@FindBy(xpath = "//input[@type='checkbox']" )
    	private WebElement checkbox;
    	
    	@FindBy(xpath = "//button[text()='Proceed']" )
    	private WebElement proceed;

		
}


