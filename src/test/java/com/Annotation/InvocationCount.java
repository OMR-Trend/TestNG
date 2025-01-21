package com.Annotation;

import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test
	private void usernamee() {
		// TODO Auto-generated method stub
		System.out.println("username");

	}
	
	@Test
	private void passwordd() {
		// TODO Auto-generated method stub
		System.out.println("password");

	}
	
	@Test(invocationCount = 3)
	private void loginnn() {
		System.out.println("login");
	}
	
	
}
