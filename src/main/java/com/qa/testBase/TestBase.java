package com.qa.testBase;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.DalalLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
	@BeforeMethod
	   public void SetUp()
	  {
	   String browser = "Chrome";
	   
	   switch (browser)
	   {
	     case "Chrome":
	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     break;
	
	     case "Edge":
	     WebDriverManager.edgedriver().setup();
	     driver = new EdgeDriver();
	     break;
	  
	     case "Firefox":
	     WebDriverManager.firefoxdriver().setup();
	     driver = new FirefoxDriver();
	     break;
	  
	     default:
	     System.out.println("Please enter an appropriate browser from the above list");
	 }
	
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get("https://apps.dalalstreet.ai/login");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	   DalalLoginPage login = new DalalLoginPage();
	   login.enterEmail("aishwaryabolegave@gmail.com");
	   login.enterPassword("aishwarya123");
	   login.clickOnLogIn();
	}
     @AfterMethod
	public void tearDown() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.quit();
	}
}