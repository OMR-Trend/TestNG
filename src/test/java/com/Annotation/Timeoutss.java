package com.Annotation;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Timeoutss {
	
	
	@Test(timeOut = 2000 , expectedExceptions = ThreadTimeoutException.class)
	private void loginn() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		System.out.println("login");

	}
	
	
	
	
	
	
	
	
	

}
