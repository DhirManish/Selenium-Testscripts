package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New {
	

	public static void main(String[] args) throws InterruptedException{
			
	String Srch = "btnK";
		
		String input = "q";
		
		String searchvalue = "Selenium Testing";
		
		String results = "resultStats";
		
		System.setProperty("webdriver.gecko.driver" , "D:\\Java Selenium\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		WebDriver drv = new FirefoxDriver();
		
		drv.get("https://www.google.com");
	
		drv.findElement(By.name(input)).sendKeys(searchvalue);
		
		drv.findElement(By.name(Srch)).click();
		
		WebElement resultcount = drv.findElement(By.id(results));
		
		//resultcount.wait();
		
		String result =  resultcount.getText();
		
		//drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Search is completed. " + result + "found for search attempt of " + searchvalue);
		
		drv.close();

	}

}