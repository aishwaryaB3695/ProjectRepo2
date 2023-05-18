package com.qa.pageTestLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.DalalLoginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
    
	@Test  
	public void verifyLoginFunctinality()
	{
	 DalalLoginPage login = new DalalLoginPage();
	 
	 login.enterEmail("");
	 login.enterPassword("");
	 login.clickOnLogIn();
	
	String expected_title = "Login to Dalalstreet.ai the future of trading";
	String actual_title = login.getTitle();
	
	System.out.println("Expected Title"+expected_title);
	System.out.println(actual_title);
	}

}
