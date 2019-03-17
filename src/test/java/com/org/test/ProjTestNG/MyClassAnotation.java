package com.org.test.ProjTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClassAnotation {

	@Test
	public void f() {
		System.out.println("Method F");
	}
	
	@Test(groups="abc")
	public void a() {
		System.out.println("Method A");
	}
	
	@BeforeTest
	public void befTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterMethod
	public void aftMethod() {
		System.out.println("---After Method");
	}
	
	@BeforeMethod
	public void befMethod() {
		System.out.println("===Before Method");
	}
	
	@BeforeClass
	public void befClass() {
		System.out.println("++Before Class++");
	}
	
	@AfterClass
	public void aftClass() {
		System.out.println("++AfterClass++");
	}
	
	@BeforeSuite
	public void befSuite() {
		System.out.println("**Before Suite**");
	}
	@AfterSuite
	public void aftSuite() {
		System.out.println("**After Suite**");
	}
}
