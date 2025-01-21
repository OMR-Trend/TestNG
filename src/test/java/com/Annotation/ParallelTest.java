package com.Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	
	static WebDriver driver;
	@Test
	private void browserlaunch1() {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
	}
	
	
	@Test
	private void brwoserlaunch2() {

       driver = new ChromeDriver();
       driver.get("https://www.instagram.com/accounts/login/");

	}
	
	
	
	
	
	
	
	
	

}
