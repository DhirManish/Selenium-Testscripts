package flow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.*;


public class Test {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver" , "D:\\Gecko 16\\geckodriver.exe");
		
		WebDriver drv = new FirefoxDriver();
		
		drv.get("https://www.google.com");
		
		//drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//drv.findElement(By.id("hplogo")).click();
		
		drv.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div/input[3]")).sendKeys("Automation Testing");
				
		drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		drv.findElement(By.className("sbico-c")).click();
				   
	}
	
}
