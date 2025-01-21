package com.Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paramaterized {

	
	
	static WebDriver driver;
	@BeforeMethod
	private void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
		
	}
	
	@Test
	@Parameters({"a","b"})
	private void loginnn(String a , String b) {
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.id("pass")).sendKeys(b);

	}
	
	
	
	
}
