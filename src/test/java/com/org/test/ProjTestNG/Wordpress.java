package com.org.test.ProjTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Wordpress {
	WebDriver driver;
  @Test
  public void f() {
	  LoginClass log= new LoginClass(driver);
  		log.login();

  	DashboardClass das= new DashboardClass(driver);
  		das.post();
  }
  @BeforeTest
  public void beforeTest() {
	  	System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
  		driver= new ChromeDriver();
	    driver.get("http://demosite.center/wordpress/wp-login.php?");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
