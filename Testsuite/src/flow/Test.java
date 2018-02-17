package flow;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class Test {

	public static void main(String[] args) throws InterruptedException{
			
		String Countryname = "/html/body/div/div[6]/div[1]/div/div/div/div/div/div/span";
		
		String font = "ਪੰਜਾਬੀ";
	
		System.setProperty("webdriver.gecko.driver" , "D:\\Java Selenium\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		WebDriver drv = new FirefoxDriver();
		
		drv.get("https://www.google.com");

		drv.findElement(By.linkText(font)).click();
		
		String country = drv.findElement(By.xpath(Countryname)).getText();

		System.out.println(country);
		
		if(country.equals("ਭਾਰਤ")){
			
			System.out.println("font is chnaged");
		}
		
		drv.close();
	}
	
}
