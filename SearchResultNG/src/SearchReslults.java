 import java.util.concurrent.TimeUnit;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.testng.Assert;
 import org.testng.annotations.AfterClass;
 import org.testng.annotations.BeforeClass;
 import org.testng.annotations.Test;
 
public class SearchReslults {

	protected WebDriver wd;
	protected String result;
	
	@BeforeClass
	public void init(){
		wd = new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver" , "D:\\Java Selenium\\geckodriver-v0.19.1\\geckodriver.exe");
		
		wd.get("https://www.google.co.in");
	}
	
	@Test
	public void Search(){
		
		wd.findElement(By.name("q")).sendKeys("Selenium");
		
		wd.findElement(By.name("btnK")).click();
		
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Boolean isresultdisplayed = wd.findElement(By.id("resultStats")).isDisplayed();
		
		Assert.assertTrue(isresultdisplayed);
	
	}
	
	@AfterClass
	public void Close(){
	
		wd.close();
	
	}
	
}
