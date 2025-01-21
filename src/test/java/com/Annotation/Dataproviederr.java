package com.Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviederr {

	static WebDriver driver;
	@BeforeMethod
	private void browserlaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
		
	}
	
	@Test(dataProvider = "userdetails")
	private void logiin(String a , String b) {
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.id("pass")).sendKeys(b);
		driver.findElement(By.name("login")).click();

	}
	
	
	@DataProvider
	private Object[][] userdetails() {
		return new Object[][] {
			{"vijay","vijay@134"},
			{"vinod","vinod@45"},
			{"prabhu","pras"}
		};
	
		
		
	}
	
	
	
	
}
