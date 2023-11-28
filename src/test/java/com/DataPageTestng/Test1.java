package com.DataPageTestng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends BaseClass
{
	@Test
	public void customerLogin() throws AWTException
	{
		driver.findElement(By.xpath(".//button[text()='Customer Login']")).click();
		driver.findElement(By.xpath(".//select[@id='userSelect']")).click();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_0);
		
	}
}
