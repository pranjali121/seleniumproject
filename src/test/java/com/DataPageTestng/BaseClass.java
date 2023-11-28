package com.DataPageTestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	WebDriver driver;
	@Parameters("Browsername")
	@BeforeClass
public  void OpenBrowser(String BrowserName){
		if(BrowserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (BrowserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			BrowserName.equals("Edge");
			driver=new EdgeDriver();
		}
	}
		@BeforeMethod
		public void OpenApp()
		{
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@AfterClass
		public void closeBrowser()
		{
			driver.close();
		}
		
	


}



