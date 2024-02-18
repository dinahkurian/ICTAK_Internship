package com.ict.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	public static Properties prop=null;
	@BeforeTest
	public void setup() throws IOException
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Core_Java\\Projects\\ictproject\\LearnerTracker\\src\\test\\resources\\config.properties");
		prop.load(ip);
//		driver=new ChromeDriver();		
	
		
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@AfterTest
	public void closing() throws IOException
	{
		driver=new ChromeDriver();
		driver.quit();
	}

}
