package com.ict.test;

import java.time.Duration;
import org.testng.annotations.Test;
import com.ict.constants.AutomationConstants;
import com.ict.pages.AdminActivity;
import com.ict.pages.POfficerActivity;
import com.ict.pages.TrainerActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestClass extends TestBase{
	
	TrainerActivity obj1=null;
	POfficerActivity obj2=null;
	AdminActivity obj3=null;
	
	@Test(priority=1)
	public void trainerFunction()
	{		
		obj1=new TrainerActivity(driver);		
		obj1.loginTrainer();		
		obj1.addOneLearner();		
		
		//Assertion
		String expectedText = AutomationConstants.assert1;
		String actualText = driver.findElement(By.xpath("//div[@class='swal2-html-container']")).getText();
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Learner added to the dashboard");
		WebElement okbut = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
		okbut.click();		
		
		obj1.trainerLogout();

	}
	
	@Test(priority=2)
	public void pOfficerFunction()
	{
		obj2=new POfficerActivity(driver);		
		obj2.loginPOfficer();
		obj2.updatePOffice();
		
		//Assertion
		String expectedText = AutomationConstants.assert2;
		String actualText = driver.findElement(By.xpath("//tbody/tr[3]/td[7]")).getText();
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Placement status is updated");

		
		obj2.pOfficerLogout();
	}
	
	@Test(priority=3)
	public void adminFunction()
	{
		obj3=new AdminActivity(driver);		
		obj3.adminLogin();  //Given username and password is not matching now (admin, admin123)
		obj3.addUser();
				
		
		//Assertion
				String expectedText = AutomationConstants.assert1;
				String actualText = driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
				Assert.assertEquals(actualText, expectedText);
				System.out.println("New Training Head is added to the dashboard");
				WebElement okbut = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
				okbut.click();
				
		obj3.updateAdmin();
		obj3.adminLogout();
		
	}

}
