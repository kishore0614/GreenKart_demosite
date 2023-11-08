package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static WebDriver browser(String browser) {  //to launch browser 
		
		if (browser.equalsIgnoreCase("edge")) {
		
		WebDriverManager.edgedriver().setup();	
			
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DIVI\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
	    driver = new EdgeDriver();  //local variable
		driver.manage().window().maximize();
      }
		else if (browser.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();	
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVI\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();  //local variable
		driver.manage().window().maximize();
	  }
		return driver;	
    }
	public static void getTitle() {  //to print title in console
		String title = driver.getTitle();
		System.out.println(title); 
		
	}
	public static void getUrl(String url) {  //to enter new url
		driver.get(url);
		
	}
	public static void screenShot(String name) throws IOException   {  //to take screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DIVI\\eclipse-workspace\\Selenium\\Screenshot\\"+name+".png");
		com.google.common.io.Files.copy(src, des);
		
	}
	public static void keydown() throws AWTException {  //to use virtual keyboad keydown
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	public static void keyup() throws AWTException { //to use virtual keyboad keyup
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);	
		
	}
    public static void keyenter() throws AWTException { //to use virtual keyboad keyup
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		
	}
    
	
	
	public static void quit() {  //to quit the current window
		driver.quit();

    }
}



