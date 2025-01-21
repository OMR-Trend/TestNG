package com.Annotation;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 2)
	private void Selecttheproduct() {

		System.out.println("User select the product");
	}

	@Test(priority = 0)
	private void loginn() {
		System.out.println("user log in to the webpage");
	}
	
	@Test(priority = 1)
	private void searchforproduct() {

		System.out.println("usersearctheproduct");
	}

	@Test(priority = -1)
	private void urllaunch() {

		System.out.println("urllaunched");
		
	}

}
