package TableAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Table {
	
	protected WebDriver wd;
	
	@BeforeClass
	public void init() {
		
		wd = new FirefoxDriver();
		
		System.setProperty("Webdriver.gecko.driver", "D:\\Java Selenium\\geckodriver-v0.19.1\\geckodriver.exe");
		wd.get("https://jira.atlassian.com/secure/BrowseProjects.jspa");
		
	}
	
	@Test
	public void Indetify_Control() {
		
		List<WebElement> wbody = null;
		List<WebElement>  wrow = null;
		WebElement wcol = null;
		
		List<WebElement> wtable = wd.findElements(By.tagName("table"));
		for (WebElement itable: wtable) {
			wbody = (List<WebElement>) itable.findElement(By.tagName("tbody"));
			for(WebElement ibody: wbody) {
				wrow.add(ibody.findElement(By.tagName("tr")));
				for(WebElement irow: wrow) {
					wcol = irow.findElement(By.tagName("td"));
						wcol.findElement(By.linkText("Atlassian Cloud")).click();
				}
			}
		}
	
		wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Assert.assertEquals("Atlassian Cloud",	wd.findElement(By.id("project-name-val")).getText());
		
	}
	
	@AfterClass
	public void finishtest() {
		
		wd.close();
		
	}
	
}
