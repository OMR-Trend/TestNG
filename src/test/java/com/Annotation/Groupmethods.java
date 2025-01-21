package com.Annotation;

import org.testng.annotations.Test;

public class Groupmethods {
	
	@Test(dependsOnMethods = "loginpa")
	private void searchproduct() {
		// TODO Auto-generated method stub
		System.out.println("search product");

	}
	
	@Test
	private void loginpa() {
	System.out.println("user logged in");

	}
	
	

}
