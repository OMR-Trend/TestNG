package com.Annotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoress {

	@Test
	private void loginn() {
		// TODO Auto-generated method stub
		System.out.println("user logedin");

	}

	@Test
	@Ignore
	private void popad() {
		// TODO Auto-generated method stub
		System.out.println("Ad pop up");

	}

	@Test(enabled = false)
	private void browserpage() {
		// TODO Auto-generated method stub
		System.out.println("Amazon url launched");
	}

}
