package com.Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class STCM {

	@BeforeSuite
	private void browserlaunch() {
		System.out.println("user launch the browser");

	}

	@BeforeTest
	private void urllaunch() {

		System.out.println("User launch the amazon url");

	}

	@BeforeClass
	private void loginpage() {

		System.out.println("User login the amazon page");
	}

	@BeforeMethod
	private void searchproduct() {

		System.out.println("User searchtheproduct");

	}

	@Test
	private void selecttheproduct() {

		System.out.println("User select the Iphone 15pro");
	}

	@AfterMethod
	private void addtocart() {

		System.out.println("User added the Iphone in to the cart");

	}

	@AfterClass
	private void logoutt() {

		System.out.println("User log out the amazon url");
	}

	@AfterTest
	private void Urlclose() {

		System.out.println("user Closed the url");
	}

	@AfterSuite
	private void browserclose() {

		System.out.println("User closed the browser");
	}

}
