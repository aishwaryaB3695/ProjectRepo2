package com.qa.pageTestLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.ExchangePage;
import com.qa.testBase.TestBase;

public class ExchangePageTest extends TestBase {
	
	@Test
	public void verifyOrederFunctionality()
	{
		ExchangePage order = new  ExchangePage();
		order.clickOnBuy();
		order.orderduration();
		order.orderPrice();
		order.quantity();
		order.btn_Submit();
	}
	

}
