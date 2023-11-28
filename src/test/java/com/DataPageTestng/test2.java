package com.DataPageTestng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test2 extends BaseClass
{
	
	@Test
	public void banklogin()
	{
		driver.findElement(By.xpath(".//button[text()='Bank Manager Login']")).click();
		driver.findElement(By.xpath(".//button[contains(text(),'Add Customer')]")).click();
		driver.findElement(By.xpath(".//input[@placeholder='First Name']")).sendKeys("pranjali");
		driver.findElement(By.xpath(".//input[@placeholder='Last Name']")).sendKeys("Wavdhane");
		driver.findElement(By.xpath(".//input[@placeholder='Post Code']")).sendKeys("pune");
		driver.findElement(By.xpath(".//button[text()='Add Customer']")).click();
	}

}
