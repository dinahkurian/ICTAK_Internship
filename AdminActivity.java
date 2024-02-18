package com.ict.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminActivity {
public WebDriver driver;
	
	public AdminActivity(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void adminLogin()  //Given username and password is not matching now (admin, admin123)
	{
		WebElement uBox= driver.findElement(By.xpath("//input[@id='username']"));
		uBox.sendKeys("admin");
		WebElement pBox=driver.findElement(By.xpath("//input[@id='password']"));
		pBox.sendKeys("admin@123");
		WebElement logbut=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		logbut.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void addUser()
	{
		WebElement addbut=driver.findElement(By.xpath("//button[@class='mb-3 btn btn-success']"));
		addbut.click();
		
		WebElement namBox= driver.findElement(By.xpath("//input[@id='name']"));
		namBox.sendKeys("alphin c tom");
		
		WebElement emailBox= driver.findElement(By.xpath("//input[@id='email']"));
		emailBox.sendKeys("alphintom123@gmail.com");
		
		WebElement usernamBox=driver.findElement(By.xpath("//input[@id='username']"));
		usernamBox.sendKeys("alphintom85");
		
		WebElement passBox=driver.findElement(By.xpath("//input[@id='password']"));
		passBox.sendKeys("alphintom@1985");
		
		WebElement drdown1 = driver.findElement(By.xpath("//select[@name='roleInputs']"));		
		Select droprole = new Select(drdown1);	     
	    droprole.selectByVisibleText("Training Head");
	    
	    WebElement subbut= driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		subbut.click();	
	}
	
	public void updateAdmin()
	{
		 WebElement editbut= driver.findElement(By.xpath("//tbody/tr[2]/td[6]/button[1]"));
		 editbut.click();
		 WebElement backtbut= driver.findElement(By.xpath("//button[normalize-space()='Back to Dashboard']"));
		 backtbut.click();
	}
	

	public void adminLogout()
	{
		WebElement trainlog = driver.findElement(By.xpath("//a[@id='basic-nav-dropdown']"));
		trainlog.click();
		WebElement logout1 = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		logout1.click();
	}
}
