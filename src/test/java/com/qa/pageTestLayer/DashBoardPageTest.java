package com.qa.pageTestLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.DashBoardPage;
import com.qa.testBase.TestBase;

public class DashBoardPageTest extends TestBase {
	
	@Test
	public void verifySearchFunctionality()
	{
		DashBoardPage search = new DashBoardPage(); 
		  search.enterText("wipro");
		  search.clickOnLinkWipro();
		 
	}
}

