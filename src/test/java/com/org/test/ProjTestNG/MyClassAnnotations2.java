package com.org.test.ProjTestNG;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class MyClassAnnotations2 {
	@Test(groups= {"xyz","abc"})
	public void f() {
		System.out.println("Method F");
	}
	
	@Test(groups="abc")
	public void a() {
		System.out.println("Method A");
	}
	
	@BeforeGroups("abc")
	public void befGroup() {
		System.out.println("Before Group");
	}
}
