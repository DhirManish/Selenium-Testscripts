 import java.util.concurrent.TimeUnit;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;
 import org.testng.Assert;
 import org.testng.annotations.AfterClass;
 import org.testng.annotations.BeforeClass;
 import org.testng.annotations.Test;
 
public class SearchNG {

	protected WebDriver wd;
	protected String result;
	
	@BeforeClass
	void initate(){
		
		System.setProperty("webdriver.gecko.driver" , "D:\\Java Selenium\\geckodriver-v0.19.1\\geckodriver.exe");
		
		wd = new FirefoxDriver();
		
	}
	
	@Test
	void Test(){
		
		wd.get("https://www.google.com");
		
		wd.findElement(By.linkText("ਪੰਜਾਬੀ")).click();
		
		result = wd.findElement(By.xpath("/html/body/div/div[6]/div[1]/div/div/div/div/div/div/span")).getText();
		
		Assert.assertEquals(result, "ਭਾਰਤ");
	
	}
	
	@Test
	void testrevert(){
		
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		wd.findElement(By.linkText("English")).click();
		
		String eresult = wd.findElement(By.xpath("/html/body/div/div[6]/div[1]/div/div/div/div/div/div/span")).getText();
				
		Assert.assertEquals(eresult, "India");
	}
	
	@AfterClass
	void Close(){
		wd.close();
	}
	
}