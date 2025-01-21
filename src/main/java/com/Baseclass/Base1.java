package com.Baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	
	static WebDriver driver;
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void url(String a) {
		driver.get(a);
	}
	
	public static void max() {
		driver.manage().window().maximize();
	}
	
	public static void screenshot(String b) throws IOException {
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File fsrc = new File("C:\\Users\\vijay\\eclipse-workspace\\New\\TestNG_8.30am_Batch\\target"+b);
		FileHandler.copy(src, fsrc);
		
	}
	
	public static void  close() {
		driver.close();
	}
	
	
	
	
	

}
