package com.ict.pages;

import java.time.Duration;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class TrainerActivity {
	public WebDriver driver;
	
	public TrainerActivity(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void loginTrainer()
	{
		WebElement uBox= driver.findElement(By.xpath("//input[@id='username']"));
		uBox.sendKeys("trainer");
		WebElement pBox=driver.findElement(By.xpath("//input[@id='password']"));
		pBox.sendKeys("trainer@123");
		WebElement but=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		but.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	}
	public void addOneLearner()
	{
		WebElement add1= driver.findElement(By.xpath("//a[@href='/tadd']//button[@type='button']"));
		add1.click();
		
		WebElement uBox= driver.findElement(By.xpath("//input[@id='learnerid']"));
		uBox.sendKeys("L001");
		
		WebElement pBox=driver.findElement(By.xpath("//input[@id='name']"));
		pBox.sendKeys("Karthika");
		
		WebElement drdown1 = driver.findElement(By.xpath("//select[@name='course']"));		
		Select dropcrs = new Select(drdown1);	     
	    dropcrs.selectByVisibleText("ST");
	    
	    WebElement drdown2 = driver.findElement(By.xpath("//select[@name='project']"));		
	    Select dropproj = new Select(drdown2);	     
	    dropproj.selectByVisibleText("ICTAK");
	    
	    WebElement drdown3 = driver.findElement(By.xpath("//select[@name='batch']"));		
	    Select dropbatch = new Select(drdown3);	     
	    dropbatch.selectByVisibleText("Mar_23");
	    
	    WebElement drdown4 = driver.findElement(By.xpath("//select[@name='cstatus']"));		
	    Select dropstatus = new Select(drdown4);	     
	    dropstatus.selectByVisibleText("Qualified");
	    
	    WebElement subbut= driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		subbut.click();		    
		 	}
	
//	public void addBulkLearner()
//	{
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement add2= driver.findElement(By.xpath("//svg/*[name()='path']\r\n"));
//		add2.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
	
//	public void learndelete()
//	{
//		WebElement dlt = driver.findElement(By.xpath("//tbody/tr[1]/td[9]/button[1]"));
//		dlt.click();			
//	
//	}
	
	public void trainerLogout()
	{
		WebElement trainlog = driver.findElement(By.xpath("//a[@id='basic-nav-dropdown']"));
		trainlog.click();
		WebElement logout1 = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		logout1.click();		
	
	}
	
}
