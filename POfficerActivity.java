package com.ict.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class POfficerActivity {
	
public WebDriver driver;	
	public POfficerActivity(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void loginPOfficer()
	{
		WebElement uBox= driver.findElement(By.xpath("//input[@id='username']"));
		uBox.sendKeys("pofficer");
		WebElement pBox=driver.findElement(By.xpath("//input[@id='password']"));
		pBox.sendKeys("pofficer@123");
		WebElement but=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		but.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	}
	
	public void updatePOffice()
	{
		 WebElement editbut= driver.findElement(By.xpath("//tbody/tr[3]/td[8]/button[1]"));
		 editbut.click();
		 WebElement drdown5 = driver.findElement(By.xpath("//select[@name='pstatus']"));		
		 Select dropplace = new Select(drdown5);	     
		 dropplace.selectByVisibleText("Placed");
		 WebElement subbut= driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		 subbut.click();
	}
	
//	public void addPlaceStatus()
//	{
//		WebElement editbut = driver.findElement(By.xpath("//svg[@class='ionicon s-ion-icon']"));
//		editbut.click();
//	}
	
	public void pOfficerLogout()
	{
		WebElement trainlog = driver.findElement(By.xpath("//a[@id='basic-nav-dropdown']"));
		trainlog.click();
		WebElement logout2 = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		logout2.click();
	}

}
