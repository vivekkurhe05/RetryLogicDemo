package com.failedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Analyzer.RetryAnalyzer;


public class MyTests {

	
	@Test
	public void Test1(){
		
		Assert.assertEquals(true, true);
		
	}
	
	@Test
	public void Test2(){
		
		Assert.assertEquals(false, true);
		
	}


}
