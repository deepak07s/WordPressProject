package com.org.test.ProjTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver;
    public static void main( String[] args )
    {
    	App ref= new App();
    	ref.setup();
    	
    	LoginClass log= new LoginClass(driver);
    	log.login();

    	DashboardClass das= new DashboardClass(driver);
    	das.post();
    	
    	ref.tearDown();  
    }
    
    public void setup()
    {
    	System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
    	driver= new ChromeDriver();
        driver.get("http://demosite.center/wordpress/wp-login.php?");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDown(){
    	driver.quit();
    }
    
}