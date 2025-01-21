package com.Annotation;

import org.testng.annotations.Test;

public class Groupingss {

	@Test(groups = "laptop",dependsOnGroups = "mobile")
	private void asus() {

		System.out.println("Asusaz10");
	}

	@Test(groups = "laptop",dependsOnGroups = "mobile")
	private void hppavilion() {

		System.out.println("hp pavilion 5");
	}

	@Test(groups = "laptop",dependsOnGroups = "mobile")
	private void lenovo() {

		System.out.println("lenovo ideapad 3");
	}

	@Test(groups = "mobile")
	private void iphone() {

		System.out.println("iphone15");
	}

	@Test(groups = "mobile")
	private void samsung() {
		// TODO Auto-generated method stub
		System.out.println("samasung a50");

	}

	@Test(groups = "mobile")
	private void nokia() {
		// TODO Auto-generated method stub
		System.out.println("nokia");

	}

}
