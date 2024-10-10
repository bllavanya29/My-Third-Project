package com.TestNGDemo3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class POBTestCaseTest1 {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void TestRun() {
		PageObjectModelTest1  pob =new  PageObjectModelTest1(driver);
		pob.username("Admin");
		pob.password("admin123");
		pob.Loginbutton();
		
		//validation
		Assert.assertEquals(driver.getTitle(),("Orangehrm"));
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
}
