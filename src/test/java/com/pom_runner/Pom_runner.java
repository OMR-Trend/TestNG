package com.pom_runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pom.Pom_class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom_runner {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/index.php/");
		
		
		Pom_class p = new Pom_class(driver);
		
		WebElement username = p.getUsername();
		username.sendKeys("qwert");
		
		
		
		
		
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("wert");
		
		
		
		
		
	}
	
	
	
	
	
}
