 //import java.util.concurrent.TimeUnit;
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
		System.setProperty("webdriver.gecko.driver" , "D:\\Java Selenium\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		wd = new FirefoxDriver();
		//wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	void Test(){
		wd.get("https://www.google.com");
		wd.findElement(By.linkText("ਪੰਜਾਬੀ")).click();
		result = wd.findElement(By.xpath("/html/body/div/div[6]/div[1]/div/div/div/div/div/div/span")).getText();
		
		if(result == "ਭਾਰਤ"){
			System.out.println(result);
		}
		else {
			System.out.println("Testing fail");
		}
		
		Assert.assertEquals(result, "ਭਾਰਤ");
	}
	
	@AfterClass
	void Close(){
		
		wd.close();
	}
	
}
