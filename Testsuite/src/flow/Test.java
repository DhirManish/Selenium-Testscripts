package flow;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.*;


public class Test {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver" , "D:\\Java Selenium\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		WebDriver drv = new FirefoxDriver();
		
		drv.get("https://www.google.com");
		
		drv.quit();
		
	}
	
}
