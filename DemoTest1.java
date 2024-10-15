package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest1 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://demoqa.com/automation-practice-form");
		   
		   System.out.println("Launched");
		   driver.close();
		
		
	}

}
